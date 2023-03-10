package org.codesapiens.data.service;

import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.accordion.AccordionPanel;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.MultiSelectComboBox;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;
import org.codesapiens.data.entity.ItemEntity;

public class StyleUtils {

    private StyleUtils() {
    }


    public static void removeAllMarginAndPadding(Element element) {
        element.getStyle()
                .set("margin", "0")
                .set("padding", "0");
    }

    public static void styleCloseIcon(Icon icoClose) {
        icoClose.setColor("red");
        icoClose.setSize("20px");
        icoClose.getStyle()
                .set("cursor", "pointer")
                .set("float", "right")
                .set("margin-top", "10px")
                .set("margin-right", "10px");
    }

    public static void styleMultiSelectComboBox(MultiSelectComboBox<ItemEntity> itemBox, String category) {
        itemBox.setLabel(category);
        itemBox.setPlaceholder(category + " seçiniz");
        itemBox.setItemLabelGenerator(ItemEntity::getTitle);
        itemBox.setClearButtonVisible(true);
        itemBox.setAllowCustomValue(true);
        itemBox.setRequired(false);
        itemBox.setRequiredIndicatorVisible(false);
        itemBox.setMinWidth("100%");
        itemBox.setWidth("100%");
    }

    public static void footerButton(Button button, String position, String background) {
        button.getStyle()
                .set("background-color", background)
                .set("color", "#fff")
                .set("border", "none")
                .set("border-radius", "5px")
                .set(position, "0")
                .set("bottom", "0")
                .set("z-index", "1000");
    }

    public static void footerLayout(Element element) {
        element.getStyle()
                .set("position", "absolute")
                .set("bottom", "0")
                .set("width", "100%")
                .set("padding", "10px")
                .set("margin", "0")
                .set("align-items", "center")
                .set("justify-content", "space-between")
                .set("background-color", "transparent")
                .set("z-index", "1000");
    }

    public static void shareButtons(Element component) {
        component.getStyle()
                .set("bottom", "0")
                .set("width", "50%")
                .set("max-width", "75%")
                .set("padding", "10px")
                .set("margin", "0")
                .set("background-color", "transparent")
                .set("z-index", "1000");
    }

    public static void styleDialogButton(Element element) {
        element.getStyle()
                .set("margin-top", "1em")
                .set("color", "white")
                .set("border", "none");
    }

    public static void pageLayout(Element component) {
        component.getStyle()
                .set("background-color", "#f5f5f5")
                .set("padding", "0")
                .set("margin", "0")
                .set("spacing", "0")
                .set("border", "0")
                .set("font-family", "Roboto, sans-serif");
    }

    public static void pageBackground(Element element) {
        element.getStyle()
                .set("background", "url('https://i.imgur.com/PmaoaSD.png') no-repeat center center fixed")
                .set("background-size", "cover")
                .set("margin", "0")
                .set("padding", "0")
                .set("align-items", "center")
                .set("justify-content", "center")
                .set("height", "100vh");
    }

    public static void headerLayout(Element element) {
        element.getStyle()
                .set("position", "absolute")
                .set("top", "20px")
                .set("width", "100%")
                .set("padding", "10px")
                .set("margin", "0")
                .set("align-items", "center")
                // center the header
                .set("justify-content", "center")
                .set("background-color", "transparent")
                .set("z-index", "1000");
    }

    public static void styleAccordionItem(AccordionPanel accordionPanel, String category) {

        final var medicalColor = "#00bcd4";
        final var foodColor = "#4caf50";
        final var clothingColor = "#ff9800";
        final var shelterColor = "#f44336";
        final var transportationColor = "#9c27b0";
        final var educationColor = "#673ab7";

        String selectedColor = "";

        if (category.equals("Medical") || category.equals("Health") || category.equals("Healthcare") ||
                category.equals("Medikal") || category.equals("Sağlık") || category.equals("Sağlık Hizmetleri")) {
            selectedColor = medicalColor;
        } else if (category.equals("Food") || category.equals("Yiyecek") || category.equals("Yiyecek Yardımı")
                || category.equals("Gıda") || category.equals("Gıda Yardımı") || category.equals("Yiyecek İçecek")) {
            selectedColor = foodColor;
        } else if (category.equals("Clothing") || category.equals("Giyim") || category.equals("Giyim Yardımı")
                || category.equals("Kıyafet") || category.equals("Kıyafet Yardımı") || category.equals("Kıyafet Giyim")) {
            selectedColor = clothingColor;
        } else if (category.equals("Shelter") || category.equals("Konaklama") || category.equals("Konaklama Yardımı")
                || category.equals("Barınma") || category.equals("Barınma Yardımı") || category.equals("Barınma Konaklama") ||
                category.equals("Ev") || category.equals("Ev Yardımı") || category.equals("Ev Konaklama")) {
            selectedColor = shelterColor;
        } else if (category.equals("Transportation") || category.equals("Ulaşım") || category.equals("Ulaşım Yardımı")
                || category.equals("Taşıma") || category.equals("Taşıma Yardımı") || category.equals("Taşıma Ulaşım")) {
            selectedColor = transportationColor;
        } else if (category.equals("Education") || category.equals("Eğitim") || category.equals("Eğitim Yardımı")) {
            selectedColor = educationColor;
        } else if (category.equals("Baby") || category.equals("Bebek") || category.equals("Bebek Yardımı")) {
            selectedColor = "#e91e63";
        } else if (category.equals("Hygene") || category.equals("Hijyen") || category.equals("Hijyen Yardımı")) {
            selectedColor = "#ffeb3b";
        } else if (category.equals("Other") || category.equals("Diğer") || category.equals("Diğer Yardım")) {
            selectedColor = "#9e9e9e";
        }

        accordionPanel.getStyle()
                .set("background-color", selectedColor)
                .set("border-radius", "5px")
                .set("margin", "0px")
                .set("padding", "0px")
                .set("width", "100%");
    }

    public static void styleIcon(Image callHelpOnSmsIcon) {
        callHelpOnSmsIcon.setWidth("50px");
        callHelpOnSmsIcon.setHeight("50px");
    }

    public static void styleAccordion(Accordion accordion) {
        accordion.getElement()
                .getStyle()
                .set("background", "rgba(255, 255, 255, 0.8)")
                .set("backdrop-filter", "blur(10px)")
                .set("border-radius", "10px")
                .set("box-shadow", "0 8px 32px 0 rgba(31, 38, 135, 0.37)")
                .set("backdrop-filter", "blur(10.0px)")
                .set("border", "1px solid rgba(255, 255, 255, 0.18)")
                .set("margin", "10px")
                .set("padding", "10px")
                .set("width", "100%")
                .set("height", "85%");
    }

    public static void styleTextField(TextField element) {
        // add glass effect to element
        element.getStyle()
                .set("background", "rgba(255, 255, 255, 0.4)")
                .set("border", "1px solid rgba(255, 255, 255, 0.4)")
                .set("border-radius", "5px")
                .set("padding", "5px")
                .set("margin", "5px");
        element.setPlaceholder("Telefon Numarası");
        // Set constraint validation for Turkish phone numbers
        element.setPattern("^\\+?\\d{10,13}$");
        element.setRequiredIndicatorVisible(true);
        element.setRequired(true);
        element.focus();
        element.setWidth("200px");
        element.setMaxWidth("280px");
    }

    public static void footerTextField(TextField phoneField) {
        phoneField.getStyle()
                .set("background-color", "#fff")
                .set("color", "#000")
                .set("border", "none")
                .set("border-radius", "5px")
                .set("padding", "10px")
                .set("margin", "0")
                .set("z-index", "1000");
    }

    public static void styleInitialDialogPhoneField(TextField initialDialogPhoneField) {
        initialDialogPhoneField.getStyle().set("font-size", "16px");
        initialDialogPhoneField.getStyle().set("font-weight", "bold");
        initialDialogPhoneField.getStyle().set("padding", "10px");
        initialDialogPhoneField.getStyle().set("border-radius", "5px");
        initialDialogPhoneField.getStyle().set("border", "1px solid #cccccc");
        initialDialogPhoneField.getStyle().set("width", "100%");
    }

    public static void styleInitialDialogFooterButton(Button initialDialogFooterButton) {
        initialDialogFooterButton.getStyle().set("background-color", "#4caf50");
        initialDialogFooterButton.getStyle().set("color", "#ffffff");
        initialDialogFooterButton.getStyle().set("border-radius", "5px");
        initialDialogFooterButton.getStyle().set("font-size", "16px");
        initialDialogFooterButton.getStyle().set("font-weight", "bold");
        initialDialogFooterButton.getStyle().set("padding", "10px");
    }

    public static void styleInitialDialogBodyLabel(Label initialDialogBodyLabel) {
        initialDialogBodyLabel.getStyle().set("font-size", "16px");
    }

    public static void styleInitialDialogHeaderLabel(Label initialDialogHeaderLabel) {
        initialDialogHeaderLabel.getStyle().set("font-size", "20px");
        initialDialogHeaderLabel.getStyle().set("font-weight", "bold");
    }

    public static void styleInitialDialogFooter(HorizontalLayout initialDialogFooter) {
        initialDialogFooter.setAlignItems(FlexComponent.Alignment.CENTER);
        initialDialogFooter.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        initialDialogFooter.setPadding(true);
        initialDialogFooter.setSpacing(true);
        initialDialogFooter.setWidthFull();
    }

    public static void styleInitialDialogBody(HorizontalLayout initialDialogBody) {
        initialDialogBody.setAlignItems(FlexComponent.Alignment.CENTER);
        initialDialogBody.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        initialDialogBody.setPadding(true);
        initialDialogBody.setSpacing(true);
        initialDialogBody.setWidthFull();
        initialDialogBody.setHeightFull();
    }

    public static void styleInitialDialogHeader(HorizontalLayout initialDialogHeader) {
        initialDialogHeader.setAlignItems(FlexComponent.Alignment.CENTER);
        initialDialogHeader.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        initialDialogHeader.setPadding(true);
        initialDialogHeader.setSpacing(true);
        initialDialogHeader.setWidthFull();
        initialDialogHeader.setHeightFull();
    }

    public static void styleInitialDialogLayout(VerticalLayout initialDialogLayout) {
        initialDialogLayout.setAlignItems(FlexComponent.Alignment.CENTER);
        initialDialogLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        initialDialogLayout.setPadding(true);
        initialDialogLayout.setSpacing(true);
        initialDialogLayout.setWidthFull();
        initialDialogLayout.setHeightFull();
    }

    public static void styleInitialDialog(Dialog initialDialog) {
        initialDialog.setCloseOnEsc(false);
        initialDialog.setCloseOnOutsideClick(false);
        initialDialog.setWidth("400px");
        initialDialog.setHeight("200px");
        initialDialog.getElement().getStyle().set("background-color", "#f5f5f5");
        initialDialog.getElement().getStyle().set("border-radius", "10px");
        initialDialog.getElement().getStyle().set("box-shadow", "0 0 10px 0 rgba(0,0,0,0.5)");
    }
}
