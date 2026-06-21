package me;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public enum b extends h {
    public b() {
        super("IDENTITY", 0);
    }

    @Override // me.h
    public final String b(Field field) {
        return field.getName();
    }
}
