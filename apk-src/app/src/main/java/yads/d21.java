package yads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d21 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f37596a;

    public d21(HttpURLConnection httpURLConnection) {
        super(e21.a(httpURLConnection));
        this.f37596a = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f37596a.disconnect();
    }
}
