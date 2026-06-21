package com.yandex.div;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class DivDataTag {
    public static final DivDataTag INVALID = new DivDataTag("");

    @NonNull
    private final String mId;

    public DivDataTag(@NonNull String str) {
        this.mId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mId.equals(((DivDataTag) obj).mId);
    }

    public int hashCode() {
        return this.mId.hashCode();
    }
}
