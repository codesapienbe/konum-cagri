package org.codesapiens.ahbap.views;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import org.codesapiens.ahbap.data.entity.ItemEntity;
import org.codesapiens.ahbap.data.service.StyleUtils;

import java.util.List;

@Tag("vaadin-items-group")
public class ItemCheckBoxGroup extends CheckboxGroup<ItemEntity> {

    public ItemCheckBoxGroup(List<ItemEntity> items) {
        super("Items");
        setItems(items);
        setItemLabelGenerator(ItemEntity::getTitle);

        StyleUtils.removeAllMarginAndPadding(this.getElement());
    }
}
