package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class L4 extends DatabaseScript {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K4 f22599a = new K4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J4 f22600b = new J4();

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        this.f22599a.runScript(sQLiteDatabase);
        this.f22600b.runScript(sQLiteDatabase);
    }
}
