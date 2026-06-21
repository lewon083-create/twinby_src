package p3;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f31211b = new z();

    @Override // p3.h
    public final Uri getUri() {
        return null;
    }

    @Override // p3.h
    public final long open(l lVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // j3.h
    public final int read(byte[] bArr, int i, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // p3.h
    public final void close() {
    }

    @Override // p3.h
    public final void addTransferListener(e0 e0Var) {
    }
}
