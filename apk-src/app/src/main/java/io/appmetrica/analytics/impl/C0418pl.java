package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0418pl implements InterfaceC0652z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z6 f24592a;

    public C0418pl(Z6 z62) {
        this.f24592a = z62;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0652z6
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0652z6
    public final SQLiteDatabase a() {
        try {
            return this.f24592a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
