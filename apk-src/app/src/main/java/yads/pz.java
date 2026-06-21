package yads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pz extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentResolver f42120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f42121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f42122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f42123h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f42124j;

    public pz(Context context) {
        super(false);
        this.f42120e = context.getContentResolver();
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws oz {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = u30Var.f43533a;
                this.f42121f = uri;
                e();
                if ("content".equals(u30Var.f43533a.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.f42120e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.f42120e.openAssetFileDescriptor(uri, "r");
                }
                this.f42122g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new oz(new IOException("Could not open file descriptor for: " + uri), 2000);
                    } catch (IOException e3) {
                        e = e3;
                        throw new oz(e, e instanceof FileNotFoundException ? 2005 : i);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f42123h = fileInputStream;
                if (length != -1 && u30Var.f43538f > length) {
                    throw new oz(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(u30Var.f43538f + startOffset) - startOffset;
                if (jSkip != u30Var.f43538f) {
                    throw new oz(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.i = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.i = jPosition;
                        if (jPosition < 0) {
                            throw new oz(null, 2008);
                        }
                    }
                } else {
                    long j10 = length - jSkip;
                    this.i = j10;
                    if (j10 < 0) {
                        throw new oz(null, 2008);
                    }
                }
                long jMin = u30Var.f43539g;
                if (jMin != -1) {
                    long j11 = this.i;
                    if (j11 != -1) {
                        jMin = Math.min(j11, jMin);
                    }
                    this.i = jMin;
                }
                this.f42124j = true;
                b(u30Var);
                long j12 = u30Var.f43539g;
                return j12 != -1 ? j12 : this.i;
            } catch (oz e7) {
                throw e7;
            }
        } catch (IOException e10) {
            e = e10;
            i = 2000;
        }
    }

    @Override // yads.p30
    public final void close() {
        this.f42121f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f42123h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f42123h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f42122g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e3) {
                        throw new oz(e3, 2000);
                    }
                } finally {
                    this.f42122g = null;
                    if (this.f42124j) {
                        this.f42124j = false;
                        d();
                    }
                }
            } catch (Throwable th2) {
                this.f42123h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f42122g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f42122g = null;
                        if (this.f42124j) {
                            this.f42124j = false;
                            d();
                        }
                        throw th2;
                    } finally {
                        this.f42122g = null;
                        if (this.f42124j) {
                            this.f42124j = false;
                            d();
                        }
                    }
                } catch (IOException e7) {
                    throw new oz(e7, 2000);
                }
            }
        } catch (IOException e10) {
            throw new oz(e10, 2000);
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f42121f;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i10) throws oz {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i10 = (int) Math.min(j10, i10);
            } catch (IOException e3) {
                throw new oz(e3, 2000);
            }
        }
        FileInputStream fileInputStream = this.f42123h;
        int i11 = lb3.f40466a;
        int i12 = fileInputStream.read(bArr, i, i10);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.i;
        if (j11 != -1) {
            this.i = j11 - ((long) i12);
        }
        c(i12);
        return i12;
    }
}
