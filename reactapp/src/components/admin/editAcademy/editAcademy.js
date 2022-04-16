import React, { useState } from "react";
import Button from "../../web components/buttons/Button";
import Input from "../../web components/input/Input";
import "./editAcademy.css";

const EditAcademy = () => {
  const [valuee, setValue] = useState({
    academyName: "",
    contactNumber: "",
    imageUrl: "",
    academyEmail: "",
    academyLocation: "",
    academyDescription: "",
  });
  const assignValues = (e) => {
    const name = e.target.name;
    const value = e.target.value;
    setValue({
      ...valuee,
      [name]: value,
    });
  };
  let academy = [];
  const submitting = (e) => {
    let state = {
      academyName: valuee.academyName,
      contactNumber: valuee.contactNumber,
      imageUrl: valuee.imageUrl,
      academyEmail: valuee.academyEmail,
      academyLocation: valuee.academyLocation,
      academyDescription: valuee.academyDescription,
    };
    academy.push(state);
    console.log(state);
    e.preventDefault();
  };
  return (
    <div className="main-container">
      <div className="academy-container">
        <div className="form-header">
          <h1>Edit Academy</h1>
        </div>
        <div className="form-span">
          <div className="form-input-container">
            <form onSubmit={submitting}>
              <div className="form1">
                <Input
                  inputType={"text"}
                  inputName={"editAcademyName"}
                  inputId={"editAcademyName"}
                  inputPlaceholder={"Enter Academy Name"}
                  value={valuee.academyName}
                  onChange={assignValues}
                ></Input>
                <br />
                <Input
                  inputType={"text"}
                  inputName={"editImageUrl"}
                  inputId={"editImageUrl"}
                  inputPlaceholder={"Enter the Academy Image Url"}
                  value={valuee.imageUrl}
                  onChange={assignValues}
                ></Input>
                <br />
                <Input
                  inputType={"text"}
                  inputName={"editAcademyLocation"}
                  inputId={"editAcademyLocation"}
                  inputPlaceholder={"Enter Academy Location"}
                  value={valuee.academyLocation}
                  onChange={assignValues}
                ></Input>
                <br />
                <Input
                  inputType={"text"}
                  inputName={"editContactNumber"}
                  inputId={"editContactNumber"}
                  inputPlaceholder={"Enter the Contact Number"}
                  value={valuee.contactNumber}
                  onChange={assignValues}
                ></Input>
                <br />
                <Input
                  inputType={"text"}
                  inputName={"editEmailId"}
                  inputId={"editEmailId"}
                  inputPlaceholder={"Enter the Academy Email"}
                  value={valuee.academyEmail}
                  onChange={assignValues}
                ></Input>
                <br />
                <Input
                  inputType={"text"}
                  inputName={"editAcademyDesciption"}
                  inputId={"editAcademyDescription"}
                  inputPlaceholder={"Enter Academy Description"}
                  value={valuee.academyDescription}
                  onChange={assignValues}
                ></Input>
                <br />
              </div>
              <div className="form-btn1">
                <Button
                  className="button"
                  id="updateAcademy"
                  BtnName={"Update"}
                  value="Update"
                />
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  );
};

export default EditAcademy;
