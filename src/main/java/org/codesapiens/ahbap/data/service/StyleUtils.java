package org.codesapiens.ahbap.data.service;

import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.accordion.AccordionPanel;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;

public class StyleUtils {

    private StyleUtils() {
    }


    public static void removeAllMarginAndPadding(Element element) {
        element.getStyle()
                .set("margin", "0")
                .set("padding", "0");
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

    public static void dialogButton(Element element) {
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
                .set("background", "url('https://images.unsplash.com/photo-1517436073-3b1b1b1b1b1b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80') no-repeat center center fixed")
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
        } else if (category.equals("Food") || category.equals("Yiyecek") || category.equals("Yiyecek Yardımı")) {
            selectedColor = foodColor;
        } else if (category.equals("Clothing") || category.equals("Giyim") || category.equals("Giyim Yardımı")) {
            selectedColor = clothingColor;
        } else if (category.equals("Shelter") || category.equals("Konaklama") || category.equals("Konaklama Yardımı")) {
            selectedColor = shelterColor;
        } else if (category.equals("Transportation") || category.equals("Ulaşım") || category.equals("Ulaşım Yardımı")) {
            selectedColor = transportationColor;
        } else if (category.equals("Education") || category.equals("Eğitim") || category.equals("Eğitim Yardımı")) {
            selectedColor = educationColor;
        }

        accordionPanel.getStyle()
                .set("background-color", selectedColor)
                .set("border-radius", "5px")
                .set("padding", "10px")
                .set("margin", "10px")
                .set("width", "100%")
                .set("height", "75%")
                .set("color", "white");
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
}