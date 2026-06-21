package com.yandex.varioqub.config.impl;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f15355a;

    public static String a(String str) {
        String str2 = f15355a;
        if (str2 == null) {
            str2 = "https://app.uaas.yandex.ru/v1/app?client_id=%s";
        }
        return String.format(str2, Arrays.copyOf(new Object[]{str}, 1));
    }
}
