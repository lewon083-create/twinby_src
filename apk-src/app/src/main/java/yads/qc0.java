package yads;

import android.database.Cursor;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qc0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cursor f42266a;

    public qc0(Cursor cursor) {
        this.f42266a = cursor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f42266a.close();
    }
}
