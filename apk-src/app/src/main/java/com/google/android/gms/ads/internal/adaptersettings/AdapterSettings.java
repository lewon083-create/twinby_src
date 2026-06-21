package com.google.android.gms.ads.internal.adaptersettings;

import com.google.android.gms.internal.ads.vk;
import q9.s;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final vk adapterSettingsInternal = s.f31967e.f31971d;

    private boolean getBoolean(String str, boolean z5) {
        vk vkVar = this.adapterSettingsInternal;
        vkVar.getClass();
        return !str.startsWith("adapter:") ? z5 : vkVar.f11402c.optBoolean(str, z5);
    }

    private float getFloat(String str, float f10) {
        vk vkVar = this.adapterSettingsInternal;
        vkVar.getClass();
        return !str.startsWith("adapter:") ? f10 : (float) vkVar.f11402c.optDouble(str, f10);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                try {
                    if (instance == null) {
                        instance = new AdapterSettings();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private int getInt(String str, int i) {
        vk vkVar = this.adapterSettingsInternal;
        vkVar.getClass();
        return !str.startsWith("adapter:") ? i : vkVar.f11402c.optInt(str, i);
    }

    private long getLong(String str, long j10) {
        vk vkVar = this.adapterSettingsInternal;
        vkVar.getClass();
        return !str.startsWith("adapter:") ? j10 : vkVar.f11402c.optLong(str, j10);
    }

    private String getString(String str, String str2) {
        vk vkVar = this.adapterSettingsInternal;
        vkVar.getClass();
        return !str.startsWith("adapter:") ? str2 : vkVar.f11402c.optString(str, str2);
    }
}
