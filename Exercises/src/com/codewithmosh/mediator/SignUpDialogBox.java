package com.codewithmosh.mediator;

public class SignUpDialogBox {
    private TextBox username = new TextBox();
    private TextBox password = new TextBox();
    private CheckBox agreement = new CheckBox();
    private Button submitButton = new Button();

    public SignUpDialogBox(){
        username.addEventListener(this::dataChanged);
        password.addEventListener(this::dataChanged);
        agreement.addEventListener(this::dataChanged);
    }

    public void setData(String user, String pass, boolean term) {
        username.setContent(user);
        password.setContent(pass);
        agreement.setChecked(term);
        System.out.println("Can you submit: " + submitButton.isEnabled());
    }

    protected void dataChanged() {
        var name = username.getContent();
        var pass = password.getContent();
        var term = agreement.isChecked();
        submitButton.setEnabled(name != null && !name.isEmpty() &&
                                pass != null && !pass.isEmpty() && term);
    }
}
