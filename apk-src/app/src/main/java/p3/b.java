package p3;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AssetManager f31120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Uri f31121s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InputStream f31122t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f31123u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f31124v;

    public b(Context context) {
        super(false);
        this.f31120r = context.getAssets();
    }

    @Override // p3.h
    public final void close() {
        this.f31121s = null;
        try {
            try {
                InputStream inputStream = this.f31122t;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e3) {
                throw new a(e3, 2000);
            }
        } finally {
            this.f31122t = null;
            if (this.f31124v) {
                this.f31124v = false;
                transferEnded();
            }
        }
    }

    @Override // p3.h
    public final Uri getUri() {
        return this.f31121s;
    }

    @Override // p3.h
    public final long open(l lVar) throws a {
        try {
            Uri uri = lVar.f31172a;
            long j10 = lVar.f31177f;
            this.f31121s = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            transferInitializing(lVar);
            InputStream inputStreamOpen = this.f31120r.open(path, 1);
            this.f31122t = inputStreamOpen;
            if (inputStreamOpen.skip(j10) < j10) {
                throw new a(null, 2008);
            }
            long j11 = lVar.f31178g;
            if (j11 != -1) {
                this.f31123u = j11;
            } else {
                long jAvailable = this.f31122t.available();
                this.f31123u = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f31123u = -1L;
                }
            }
            this.f31124v = true;
            transferStarted(lVar);
            return this.f31123u;
        } catch (a e3) {
            throw e3;
        } catch (IOException e7) {
            throw new a(e7, e7 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // j3.h
    public final int read(byte[] bArr, int i, int i10) throws a {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.f31123u;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i10 = (int) Math.min(j10, i10);
                } catch (IOException e3) {
                    throw new a(e3, 2000);
                }
            }
            InputStream inputStream = this.f31122t;
            String str = m3.z.f28608a;
            int i11 = inputStream.read(bArr, i, i10);
            if (i11 != -1) {
                long j11 = this.f31123u;
                if (j11 != -1) {
                    this.f31123u = j11 - ((long) i11);
                }
                bytesTransferred(i11);
                return i11;
            }
        }
        return -1;
    }
}
