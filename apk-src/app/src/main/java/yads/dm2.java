package yads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dm2 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f37836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f37837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Uri f37838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AssetFileDescriptor f37839h;
    public FileInputStream i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f37840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f37841k;

    public dm2(Context context) {
        super(false);
        this.f37836e = context.getResources();
        this.f37837f = context.getPackageName();
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // yads.p30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(yads.u30 r17) throws yads.cm2 {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.dm2.a(yads.u30):long");
    }

    @Override // yads.p30
    public final void close() {
        this.f37838g = null;
        try {
            try {
                FileInputStream fileInputStream = this.i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f37839h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e3) {
                        throw new cm2(null, e3, 2000);
                    }
                } finally {
                    this.f37839h = null;
                    if (this.f37841k) {
                        this.f37841k = false;
                        d();
                    }
                }
            } catch (Throwable th2) {
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f37839h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f37839h = null;
                        if (this.f37841k) {
                            this.f37841k = false;
                            d();
                        }
                        throw th2;
                    } finally {
                        this.f37839h = null;
                        if (this.f37841k) {
                            this.f37841k = false;
                            d();
                        }
                    }
                } catch (IOException e7) {
                    throw new cm2(null, e7, 2000);
                }
            }
        } catch (IOException e10) {
            throw new cm2(null, e10, 2000);
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f37838g;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i10) throws cm2 {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.f37840j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i10 = (int) Math.min(j10, i10);
            } catch (IOException e3) {
                throw new cm2(null, e3, 2000);
            }
        }
        FileInputStream fileInputStream = this.i;
        int i11 = lb3.f40466a;
        int i12 = fileInputStream.read(bArr, i, i10);
        if (i12 == -1) {
            if (this.f37840j == -1) {
                return -1;
            }
            throw new cm2("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f37840j;
        if (j11 != -1) {
            this.f37840j = j11 - ((long) i12);
        }
        c(i12);
        return i12;
    }
}
