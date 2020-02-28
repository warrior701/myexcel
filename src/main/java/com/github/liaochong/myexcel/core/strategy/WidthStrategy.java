/*
 * Copyright 2019 liaochong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.liaochong.myexcel.core.strategy;

import java.util.Objects;

/**
 * 宽度策略
 *
 * @author liaochong
 * @version 1.0
 */
public enum WidthStrategy {
    /**
     * 无自动宽度
     */
    NO_AUTO,

    /**
     * 自适应宽度
     */
    AUTO_WIDTH,

    /**
     * 组件调整宽度
     */
    COMPUTE_AUTO_WIDTH,
    /**
     * 自定义宽度
     */
    @Deprecated
    CUSTOM_WIDTH;

    public static boolean isNoAuto(WidthStrategy widthStrategy) {
        return Objects.equals(widthStrategy, NO_AUTO);
    }

    public static boolean isAutoWidth(WidthStrategy widthStrategy) {
        return Objects.equals(widthStrategy, AUTO_WIDTH);
    }

    public static boolean isComputeAutoWidth(WidthStrategy widthStrategy) {
        return Objects.equals(widthStrategy, COMPUTE_AUTO_WIDTH);
    }

    public static boolean isCustomWidth(WidthStrategy widthStrategy) {
        return Objects.equals(widthStrategy, CUSTOM_WIDTH);
    }
}
