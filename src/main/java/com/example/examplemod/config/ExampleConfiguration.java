package com.example.examplemod.config;

import gg.essential.universal.UChat;
import gg.essential.vigilance.Vigilant;
import gg.essential.vigilance.data.Property;
import gg.essential.vigilance.data.PropertyType;

import java.awt.*;
import java.io.File;

public class ExampleConfiguration extends Vigilant {
    @Property(
            type = PropertyType.CHECKBOX,
            name = "Checkbox",
            description = "This is a checkbox property. It stores a boolean value.",
            category = "Property Overview"
    )
    public boolean EXAMPLE_CHECKBOX = true;

    @Property(
            type = PropertyType.SWITCH,
            name = "Switch",
            description = "This is a switch property. It stores a boolean value.",
            category = "Property Overview"
    )
    public boolean EXAMPLE_SWITCH = false;

    @Property(
            type = PropertyType.TEXT,
            name = "Text",
            description = "This is a text property. It stores a single line of continuous text.",
            category = "Property Overview"
    )
    public String EXAMPLE_TEXT = "";

    @Property(
            type = PropertyType.PARAGRAPH,
            name = "Paragraph",
            description = "This is a paragraph property. It stores a multi-line piece of text, and expands as the user writes more text",
            category = "Property Overview"
    )
    public String EXAMPLE_PARAGRAPH = "";

    @Property(
            type = PropertyType.PERCENT_SLIDER,
            name = "Percent Slider",
            description = "This is a percent slider property. It stores a floating-point number between 0.0 and 1.0.",
            category = "Property Overview"
    )
    public float EXAMPLE_PERCENT_SLIDER = 0f;

    @Property(
            type = PropertyType.DECIMAL_SLIDER,
            name = "Decimal Slider",
            description = "This is a decimal slider property. It stores a floating point number between a defined minimum and maximum.",
            category = "Property Overview",
            minF = 0f,
            maxF = 12f,
            decimalPlaces = 2
    )
    public float EXAMPLE_DECIMAL_SLIDER = 1f;

    @Property(
            type = PropertyType.SLIDER,
            name = "Slider",
            description = "This is a slider property. It stores an integer between a defined minimum and maximum integer.",
            category = "Property Overview",
            min = 0,
            max = 10
    )
    public int EXAMPLE_SLIDER = 0;

    @Property(
            type = PropertyType.NUMBER,
            name = "Number",
            description = "This is a number property. It stores an integer between a defined minimum and maximum integer.",
            category = "Property Overview",
            min = 0,
            max = 10
    )
    public int EXAMPLE_NUMBER = 0;

    @Property(
            type = PropertyType.COLOR,
            name = "Color",
            description = "This is a color property. It stores a color.",
            category = "Property Overview"
    )
    public Color EXAMPLE_COLOR = new Color(255, 255, 255);

    @Property(
            type = PropertyType.SELECTOR,
            name = "Selector",
            description = "This is a selector property. It stores a specific item in a list of strings. The property will store the index of the list, not the string.",
            category = "Property Overview",
            options = {"Option 1", "Option 2", "Option 3"}
    )
    public int EXAMPLE_SELECTOR = 0;

    @Property(
            type = PropertyType.BUTTON,
            name = "Button",
            description = "This is a button property. It runs an action when clicked.",
            category = "Property Overview"
    )
    public void EXAMPLE_BUTTON() {
        UChat.chat("Example Button clicked!");
    }

    @Property(
            type = PropertyType.TEXT,
            name = "Password",
            description = "Anything you type here won't be visible unless the eye is clicked!",
            category = "Property Overview",
            placeholder = "Insert Placeholder Text",
            protectedText = true
    )
    public String EXAMPLE_PASSWORD = "";

    @Property(
            type = PropertyType.SWITCH,
            name = "Switch with dependants",
            description = "When ticked, this switch will make another setting appear",
            category = "Property Deep-Dive",
            subcategory = "Dependencies"
    )
    public boolean EXAMPLE_DEPENDENT_SWITCH = true;

    @Property(
            type = PropertyType.TEXT,
            name = "Dependant",
            description = "This setting depends on the above switch!",
            category = "Property Deep-Dive",
            subcategory = "Dependencies"
    )
    public String EXAMPLE_DEPENDENT_STRING = "You found me!";

    @Property(
            type = PropertyType.SWITCH,
            name = "Initially off switch",
            description = "Switch that starts in the off position",
            category = "Property Deep-Dive",
            subcategory = "Switches"
    )
    public boolean EXAMPLE_SWITCH_OFF = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Initially on switch",
            description = "Switch that starts in the on position",
            category = "Property Deep-Dive",
            subcategory = "Switches"
    )
    public boolean EXAMPLE_SWITCH_ON = true;

    @Property(
            type = PropertyType.TEXT,
            name = "Empty text",
            description = "A text property with no initial text or placeholder",
            category = "Property Deep-Dive",
            subcategory = "Texts"
    )
    public String EXAMPLE_EMPTY_TEXT = "";

    @Property(
            type = PropertyType.TEXT,
            name = "Text with initial value",
            description = "A text property with some initial value but no placeholder",
            category = "Property Deep-Dive",
            subcategory = "Texts"
    )
    public String EXAMPLE_FILLED_TEXT = "Hello, I am a filled-in text!";

    @Property(
            type = PropertyType.TEXT,
            name = "Text with placeholder",
            description = "A text property with a placeholder but no initial value",
            category = "Property Deep-Dive",
            subcategory = "Texts",
            placeholder = "Type some text!"
    )
    public String EXAMPLE_PLACEHOLDER_TEXT = "";

    @Property(
            type = PropertyType.TEXT,
            name = "Text with placeholder and initial value",
            description = "A text property with a placeholder and initial value. The placeholder does not appear unless the text is deleted by the user.",
            category = "Property Deep-Dive",
            subcategory = "Texts",
            placeholder = "Type some text!"
    )
    public String EXAMPLE_FILLED_PLACEHOLDER_TEXT = "Hello, I am a filled-in text with a placeholder!";

    @Property(
            type = PropertyType.PARAGRAPH,
            name = "Empty paragraph",
            description = "A paragraph property with no initial text or placeholder",
            category = "Property Deep-Dive",
            subcategory = "Paragraphs"
    )
    public String EXAMPLE_EMPTY_PARAGRAPH = "";

    @Property(
            type = PropertyType.PARAGRAPH,
            name = "Paragraph with initial value",
            description = "A paragraph property with some initial value but no placeholder",
            category = "Property Deep-Dive",
            subcategory = "Paragraphs"
    )
    public String EXAMPLE_FILLED_PARAGRAPH = "I am a paragraph! I can have text that is much, much longer than the regular text property. I also use Elementa's multiline text input component, which supports features like coyp paste, cursor navigation, click selection, and more :)";

    @Property(
            type = PropertyType.PARAGRAPH,
            name = "Paragraph with placeholder",
            description = "A paragraph property with a placeholder but no initial value",
            category = "Property Deep-Dive",
            subcategory = "Paragraphs",
            placeholder = "Type some text!"
    )
    public String EXAMPLE_PLACEHOLDER_PARAGRAPH = "";

    @Property(
            type = PropertyType.PARAGRAPH,
            name = "Paragraph with placeholder and initial value",
            description = "A paragraph property with a placeholder and initial value. The placeholder does not appear unless the text is deleted by the user.",
            category = "Property Deep-Dive",
            subcategory = "Paragraphs",
            placeholder = "Type some text!"
    )
    public String EXAMPLE_FILLED_PLACEHOLDER_PARAGRAPH = "I am a paragraph! I can have text that is much, much longer than the regular text property. I also use Elementa's multiline text input component, which supports features like coyp paste, cursor navigation, click selection, and more :)";

    @Property(
            type = PropertyType.PERCENT_SLIDER,
            name = "Percent slider",
            description = "A percent slider property with a starting value of 0.0 (0%).",
            category = "Property Deep-Dive",
            subcategory = "Percent Sliders"
    )
    public float EXAMPLE_0_PERCENT_SLIDER = 0f;

    @Property(
            type = PropertyType.PERCENT_SLIDER,
            name = "Percent slider at half",
            description = "A percent slider property with a starting value of 0.5 (50%).",
            category = "Property Deep-Dive",
            subcategory = "Percent Sliders"
    )
    public float EXAMPLE_50_PERCENT_SLIDER = 0.5f;

    @Property(
            type = PropertyType.SLIDER,
            name = "Slider starting in middle",
            description = "A slider property initially in the middle.",
            category = "Property Deep-Dive",
            subcategory = "Sliders",
            min = 0,
            max = 10
    )
    public int EXAMPLE_MIDDLE_SLIDER = 5;

    @Property(
            type = PropertyType.SLIDER,
            name = "Slider with negative values",
            description = "A slider property with negative numbers in its range",
            category = "Property Deep-Dive",
            subcategory = "Sliders",
            min = -10,
            max = 10
    )
    public int EXAMPLE_NEGATIVE_SLIDER = 0;

    @Property(
            type = PropertyType.SLIDER,
            name = "Slider with huge range",
            description = "A slider property with a huge range (0 to 1,000,000)",
            category = "Property Deep-Dive",
            subcategory = "Sliders",
            min = 0,
            max = 1_000_000
    )
    public int EXAMPLE_HUGE_SLIDER = 0;

    @Property(
            type = PropertyType.DECIMAL_SLIDER,
            name = "Decimal Slider with small range",
            description = "A decimal slider property with a small range (0 to 1)",
            category = "Property Deep-Dive",
            subcategory = "Decimal Sliders",
            minF = 0f,
            maxF = 1f,
            decimalPlaces = 3
    )
    public float EXAMPLE_SMALL_RANGE_DECIMAL_SLIDER = 0.5f;

    @Property(
            type = PropertyType.DECIMAL_SLIDER,
            name = "Decimal Slider with many decimal places",
            description = "A decimal slider property with ten decimal places. Note that the value is a floating point number so it will get trimmed.",
            category = "Property Deep-Dive",
            subcategory = "Decimal Sliders",
            minF = 1f,
            maxF = 5f,
            decimalPlaces = 10
    )
    public float EXAMPLE_10_DECIMAL_PLACE_SLIDER = (float) Math.PI;

    @Property(
            type = PropertyType.NUMBER,
            name = "Number with increment",
            description = "Number with an increment that is not 1. Hint: Try holding shift!",
            category = "Property Deep-Dive",
            subcategory = "Numbers",
            min = -500,
            max = 500,
            increment = 25
    )
    public int EXAMPLE_INCREMENTING_SLIDER = 250;

    @Property(
            type = PropertyType.NUMBER,
            name = "Number with huge range",
            description = "A number property with a huge range (0 to 1,000,000).",
            category = "Property Deep-Dive",
            subcategory = "Numbers",
            min = 0,
            max = 1_000_000
    )
    public int EXAMPLE_HUGE_NUMBER = 0;

    @Property(
            type = PropertyType.COLOR,
            name = "Color with an initial, non-white value",
            description = "A color property with an initial value of a non-white color.",
            category = "Property Deep-Dive",
            subcategory = "Colors",
            allowAlpha = false
    )
    public Color EXAMPLE_NON_WHITE_COLOR = new Color(20, 190, 240);

    @Property(
            type = PropertyType.COLOR,
            name = "Color with alpha",
            description = "A color property which allows the selection of alpha",
            category = "Property Deep-Dive",
            subcategory = "Colors",
            allowAlpha = true
    )
    public Color EXAMPLE_NON_WHITE_COLOR_ALPHA = new Color(20, 190, 240, 255 / 2);

    @Property(
            type = PropertyType.SELECTOR,
            name = "Selector with initial non-zero value",
            description = "A selector property whose initially-selected value is not the first item.",
            category = "Property Deep-Dive",
            subcategory = "Selectors",
            options = {"Option 1", "Option 2", "Option 3", "Option 4"}
    )
    public int EXAMPLE_SELECTOR_INITIAL_VALUE = 2;

    @Property(
            type = PropertyType.SELECTOR,
            name = "Selector with many options",
            description = "A selector property which has a large number of options",
            category = "Property Deep-Dive",
            subcategory = "Selectors",
            options = {
                    "Option 1",
                    "Option 2",
                    "Option 3",
                    "Option 4",
                    "Option 5",
                    "Option 6",
                    "Option 7",
                    "Option 8",
                    "Option 9",
                    "Option 10",
                    "Option 11",
                    "Option 12",
                    "Option 13",
                    "Option 14",
                    "Option 15",
                    "Option 16",
                    "Option 17",
                    "Option 18",
                    "Option 19",
                    "Option 20",
                    "Option 21",
                    "Option 22",
                    "Option 23",
                    "Option 24",
                    "Option 25",
                    "Option 26",
                    "Option 27",
                    "Option 28",
                    "Option 29",
                    "Option 30"
            }
    )
    public int EXAMPLE_LARGE_SELECTOR = 0;

    @Property(
            type = PropertyType.BUTTON,
            name = "Normal button",
            description = "A normal button. Buttons use the placeholder property for their text. If no placeholder is provided (or it is empty), it will be \"Activate\".",
            category = "Property Deep-Dive",
            subcategory = "Buttons"
    )
    public void EXAMPLE_NORMAL_BUTTON() {
        UChat.chat("Normal Button clicked!");
    }

    @Property(
            type = PropertyType.BUTTON,
            name = "Button with text",
            description = "A button that has a custom placeholder, giving it different text",
            placeholder = "Click Me!",
            category = "Property Deep-Dive",
            subcategory = "Buttons"
    )
    public void EXAMPLE_CUSTOM_BUTTON() {
        UChat.chat("Custom Button clicked!");
    }

    @Property(
            type = PropertyType.SWITCH,
            name = "Conditional Property (W)",
            description = "This property will only be visible if a condition is met! In this case, it will be visible if you are on Windows.",
            category = "Property Deep-Dive",
            subcategory = "Hidden (Conditional)"
    )
    public boolean EXAMPLE_WINDOWS_ONLY = false;


    @Property(
            type = PropertyType.SWITCH,
            name = "Conditional Property (M)",
            description = "This property will only be visible if a condition is met! In this case, it will be visible if you are on macOS.",
            category = "Property Deep-Dive",
            subcategory = "Hidden (Conditional)"
    )
    public boolean EXAMPLE_MACOS_ONLY = false;


    @Property(
            type = PropertyType.SWITCH,
            name = "Conditional Property (L)",
            description = "This property will only be visible if a condition is met! In this case, it will be visible if you are on Linux.",
            category = "Property Deep-Dive",
            subcategory = "Hidden (Conditional)"
    )
    public boolean EXAMPLE_LINUX_ONLY = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "This is a switch property with a very long name. It is recommended to use the description for lengthy property text, however this is still supported",
            category = "Meta"
    )
    public boolean EXAMPLE_LONG_NAME_SWITCH = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Property with long description",
            description = "This is a property with a very long description. As the above property says, the description is the preferred place for lengthy instruction text within a property. However, long text here is still not recommended -- try to keep descriptions as concise as possible!",
            category = "Meta"
    )
    public boolean EXAMPLE_LONG_DESC_SWITCH = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Hidden switch",
            description = "This is a hidden property. It will not appear in the in-game GUI, but will still be managed by Vigilance (i.e. saved to a file, and changeable via code).",
            category = "Hidden",
            hidden = true
    )
    public boolean EXAMPLE_HIDDEN_SWITCH = false;




    public ExampleConfiguration() {
        super(new File("./config/ExampleConfig.toml"));
        initialize();
    }

}
