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

package com.alee.extended.dock;

import java.util.EventListener;

/**
 * {@link com.alee.extended.dock.WebDockableFrame} events listener.
 *
 * @author Mikle Garin
 * @see com.alee.extended.dock.WebDockableFrame
 */

public interface DockableFrameListener extends EventListener
{
    /**
     * Called when frame was opened.
     *
     * @param frame {@link com.alee.extended.dock.WebDockableFrame}
     */
    public void frameOpened ( WebDockableFrame frame );

    /**
     * Called when frame state is changed.
     *
     * @param frame    {@link com.alee.extended.dock.WebDockableFrame}
     * @param oldState previous frame state
     * @param newState current frame state
     */
    public void frameStateChanged ( WebDockableFrame frame, DockableFrameState oldState, DockableFrameState newState );

    /**
     * Called when frame was closed.
     *
     * @param frame {@link com.alee.extended.dock.WebDockableFrame}
     */
    public void frameClosed ( WebDockableFrame frame );
}