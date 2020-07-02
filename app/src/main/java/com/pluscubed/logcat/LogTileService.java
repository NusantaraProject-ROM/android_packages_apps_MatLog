/**
 * Copyright (C) 2020 DerpFest ROM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.omnirom.logcat;

import android.content.Intent;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;

import org.omnirom.logcat.R;

public class LogTileService extends TileService {

    public LogTileService() { }

    @Override
    public void onStartListening() {
        super.onStartListening();
    }

    @Override
    public void onClick() {
        Intent matlog = new Intent(this, com.pluscubed.logcat.ui.LogcatActivity.class);
        matlog.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivityAndCollapse(matlog);
        super.onClick();
    }
}
