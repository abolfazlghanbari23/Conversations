/*
 * Copyright 2019 Daniel Gultsch
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.siacs.rasan.ui.util;

import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.Executor;

public class MainThreadExecutor implements Executor {

    private static final MainThreadExecutor INSTANCE = new MainThreadExecutor();

    private final Handler handler = new Handler(Looper.myLooper());

    @Override
    public void execute(final Runnable command) {
        handler.post(command);
    }

    public static MainThreadExecutor getInstance() {
        return INSTANCE;
    }
}
