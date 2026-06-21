package r6;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SQLiteStatement f32265e;

    public f(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement, 1);
        this.f32265e = sQLiteStatement;
    }

    public final void k() {
        this.f32265e.executeUpdateDelete();
    }
}
