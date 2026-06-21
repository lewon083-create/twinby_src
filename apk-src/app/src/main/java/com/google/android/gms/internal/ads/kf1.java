package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kf1 extends h41 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RandomAccessFile f7210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Uri f7211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f7212h;
    public boolean i;

    @Override // com.google.android.gms.internal.ads.ct1
    public final int C(byte[] bArr, int i, int i10) throws ye1 {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.f7212h;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f7210f;
            String str = cq0.f4293a;
            int i11 = randomAccessFile.read(bArr, i, (int) Math.min(j10, i10));
            if (i11 > 0) {
                this.f7212h -= (long) i11;
                c(i11);
            }
            return i11;
        } catch (IOException e3) {
            throw new ye1(e3, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void g() {
        this.f7211g = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f7210f;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f7210f = null;
                if (this.i) {
                    this.i = false;
                    f();
                }
            } catch (IOException e3) {
                throw new ye1(e3, 2000);
            }
        } catch (Throwable th2) {
            this.f7210f = null;
            if (this.i) {
                this.i = false;
                f();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long k(db1 db1Var) throws ye1 {
        Uri uri = db1Var.f4544a;
        this.f7211g = uri;
        a(db1Var);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f7210f = randomAccessFile;
            try {
                long j10 = db1Var.f4546c;
                randomAccessFile.seek(j10);
                long length = db1Var.f4547d;
                if (length == -1) {
                    length = this.f7210f.length() - j10;
                }
                this.f7212h = length;
                if (length < 0) {
                    throw new ye1(null, null, 2008);
                }
                this.i = true;
                b(db1Var);
                return this.f7212h;
            } catch (IOException e3) {
                throw new ye1(e3, 2000);
            }
        } catch (FileNotFoundException e7) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new ye1(e7, ((e7.getCause() instanceof ErrnoException) && ((ErrnoException) e7.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbJ = t.z.j("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbJ.append(fragment);
            throw new ye1(sbJ.toString(), e7, VKApiCodes.CODE_PHONE_ALREADY_USED);
        } catch (SecurityException e10) {
            throw new ye1(e10, 2006);
        } catch (RuntimeException e11) {
            throw new ye1(e11, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final Uri l() {
        return this.f7211g;
    }
}
