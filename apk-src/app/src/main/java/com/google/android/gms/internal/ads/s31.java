package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s31 extends h41 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AssetManager f10166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Uri f10167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InputStream f10168h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10169j;

    public s31(Context context) {
        super(false);
        this.f10166f = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.ct1
    public final int C(byte[] bArr, int i, int i10) throws e31 {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.i;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i10 = (int) Math.min(j10, i10);
                } catch (IOException e3) {
                    throw new e31(e3, 2000);
                }
            }
            InputStream inputStream = this.f10168h;
            String str = cq0.f4293a;
            int i11 = inputStream.read(bArr, i, i10);
            if (i11 != -1) {
                long j11 = this.i;
                if (j11 != -1) {
                    this.i = j11 - ((long) i11);
                }
                c(i11);
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void g() {
        this.f10167g = null;
        try {
            try {
                InputStream inputStream = this.f10168h;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f10168h = null;
                if (this.f10169j) {
                    this.f10169j = false;
                    f();
                }
            } catch (IOException e3) {
                throw new e31(e3, 2000);
            }
        } catch (Throwable th2) {
            this.f10168h = null;
            if (this.f10169j) {
                this.f10169j = false;
                f();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long k(db1 db1Var) throws e31 {
        try {
            Uri uri = db1Var.f4544a;
            this.f10167g = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            a(db1Var);
            InputStream inputStreamOpen = this.f10166f.open(path, 1);
            this.f10168h = inputStreamOpen;
            long j10 = db1Var.f4546c;
            if (inputStreamOpen.skip(j10) < j10) {
                throw new e31(null, 2008);
            }
            long j11 = db1Var.f4547d;
            if (j11 != -1) {
                this.i = j11;
            } else {
                long jAvailable = this.f10168h.available();
                this.i = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.i = -1L;
                }
            }
            this.f10169j = true;
            b(db1Var);
            return this.i;
        } catch (e31 e3) {
            throw e3;
        } catch (IOException e7) {
            throw new e31(e7, true != (e7 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final Uri l() {
        return this.f10167g;
    }
}
