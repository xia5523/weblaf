/*
 * This file is part of WebLookAndFeel library.
 *
 * WebLookAndFeel library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WebLookAndFeel library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WebLookAndFeel library.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.alee.demo.skin;

import com.alee.managers.style.ChildStyleId;
import com.alee.managers.style.StyleId;

/**
 * Demo Application styles.
 *
 * @author Mikle Garin
 */

public final class DemoStyles
{
    /**
     * General.
     */
    public static final StyleId toolLabel = StyleId.of ( "tool" );
    public static final StyleId toolButton = StyleId.of ( "tool" );
    public static final StyleId toolCombobox = StyleId.of ( "tool" );
    public static final StyleId filterfield = StyleId.of ( "filter" );
    public static final StyleId resourceLink = StyleId.of ( "resource" );
    public static final StyleId fieldInner = StyleId.of ( "field-inner" );

    /**
     * Examples frame.
     */
    public static final StyleId examplesTree = StyleId.of ( "examples" );

    /**
     * Central pane.
     */
    public static final StyleId emptycontentPanel = StyleId.of ( "emptycontent" );
    public static final ChildStyleId emptycontentLabel = ChildStyleId.of ( "emptycontent" );
    public static final StyleId expamplesPane = StyleId.of ( "examples" );

    /**
     * Example panel.
     */
    public static final StyleId exampleToolbar = StyleId.of ( "example" );
    public static final StyleId wikiLabel = StyleId.of ( "wiki" );
    public static final StyleId wikiLink = StyleId.of ( "wiki" );
    public static final StyleId plainPanel = StyleId.of ( "plain" );
    public static final StyleId previewsPanel = StyleId.of ( "previews" );

    /**
     * Preview panel.
     */
    public static final StyleId previewPanel = StyleId.of ( "preview" );
    public static final ChildStyleId previewTitleLabel = ChildStyleId.of ( "title" );
    public static final ChildStyleId previewSeparator = ChildStyleId.of ( "separator" );
    public static final ChildStyleId previewContent = ChildStyleId.of ( "content" );

    /**
     * Custom example styles.
     */
    public static final StyleId easingEastBar = StyleId.of ( "easing-east-bar" );
    public static final StyleId easingSouthBar = StyleId.of ( "easing-south-bar" );

    /**
     * Style code preview panel.
     */
    public static final StyleId skinSelectorsPanel = StyleId.of ( "skin-selectors" );
    public static final ChildStyleId skinSelectorButton = ChildStyleId.of ( "skin-selector" );

    /**
     * Example styles.
     */
    public static final StyleId leadingImage = StyleId.of ( "leading" );
    public static final StyleId trailingImage = StyleId.of ( "trailing" );
}