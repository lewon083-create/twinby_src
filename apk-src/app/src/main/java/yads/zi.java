package yads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zi extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetManager f45418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f45419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f45420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f45421h;
    public boolean i;

    public zi(Context context) {
        super(false);
        this.f45418e = context.getAssets();
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws yi {
        try {
            Uri uri = u30Var.f43533a;
            this.f45419f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            e();
            InputStream inputStreamOpen = this.f45418e.open(path, 1);
            this.f45420g = inputStreamOpen;
            if (inputStreamOpen.skip(u30Var.f43538f) < u30Var.f43538f) {
                throw new yi(null, 2008);
            }
            long j10 = u30Var.f43539g;
            if (j10 != -1) {
                this.f45421h = j10;
            } else {
                long jAvailable = this.f45420g.available();
                this.f45421h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f45421h = -1L;
                }
            }
            this.i = true;
            b(u30Var);
            return this.f45421h;
        } catch (yi e3) {
            throw e3;
        } catch (IOException e7) {
            throw new yi(e7, e7 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // yads.p30
    public final void close() {
        this.f45419f = null;
        try {
            try {
                InputStream inputStream = this.f45420g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e3) {
                throw new yi(e3, 2000);
            }
        } finally {
            this.f45420g = null;
            if (this.i) {
                this.i = false;
                d();
            }
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f45419f;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i10) throws yi {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.f45421h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i10 = (int) Math.min(j10, i10);
            } catch (IOException e3) {
                throw new yi(e3, 2000);
            }
        }
        InputStream inputStream = this.f45420g;
        int i11 = lb3.f40466a;
        int i12 = inputStream.read(bArr, i, i10);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f45421h;
        if (j11 != -1) {
            this.f45421h = j11 - ((long) i12);
        }
        c(i12);
        return i12;
    }
}
