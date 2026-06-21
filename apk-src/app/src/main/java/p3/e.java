package p3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ContentResolver f31139r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Uri f31140s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AssetFileDescriptor f31141t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public FileInputStream f31142u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f31143v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f31144w;

    public e(Context context) {
        super(false);
        this.f31139r = context.getContentResolver();
    }

    @Override // p3.h
    public final void close() {
        this.f31140s = null;
        try {
            try {
                FileInputStream fileInputStream = this.f31142u;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f31142u = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f31141t;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e3) {
                        throw new d(e3, 2000);
                    }
                } finally {
                    this.f31141t = null;
                    if (this.f31144w) {
                        this.f31144w = false;
                        transferEnded();
                    }
                }
            } catch (Throwable th2) {
                this.f31142u = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f31141t;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f31141t = null;
                        if (this.f31144w) {
                            this.f31144w = false;
                            transferEnded();
                        }
                        throw th2;
                    } finally {
                        this.f31141t = null;
                        if (this.f31144w) {
                            this.f31144w = false;
                            transferEnded();
                        }
                    }
                } catch (IOException e7) {
                    throw new d(e7, 2000);
                }
            }
        } catch (IOException e10) {
            throw new d(e10, 2000);
        }
    }

    @Override // p3.h
    public final Uri getUri() {
        return this.f31140s;
    }

    @Override // p3.h
    public final long open(l lVar) throws d {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = lVar.f31172a;
                long j10 = lVar.f31178g;
                long j11 = lVar.f31177f;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f31140s = uriNormalizeScheme;
                transferInitializing(lVar);
                boolean zEquals = Objects.equals(uriNormalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.f31139r;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f31141t = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new d(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
                    } catch (IOException e3) {
                        e = e3;
                        if (e instanceof FileNotFoundException) {
                            i = 2005;
                        }
                        throw new d(e, i);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f31142u = fileInputStream;
                if (length != -1 && j11 > length) {
                    throw new d(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j11) - startOffset;
                if (jSkip != j11) {
                    throw new d(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f31143v = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f31143v = jPosition;
                        if (jPosition < 0) {
                            throw new d(null, 2008);
                        }
                    }
                } else {
                    long j12 = length - jSkip;
                    this.f31143v = j12;
                    if (j12 < 0) {
                        throw new d(null, 2008);
                    }
                }
                if (j10 != -1) {
                    long j13 = this.f31143v;
                    this.f31143v = j13 == -1 ? j10 : Math.min(j13, j10);
                }
                this.f31144w = true;
                transferStarted(lVar);
                return j10 != -1 ? j10 : this.f31143v;
            } catch (IOException e7) {
                e = e7;
                i = 2000;
            }
        } catch (d e10) {
            throw e10;
        }
    }

    @Override // j3.h
    public final int read(byte[] bArr, int i, int i10) throws d {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.f31143v;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i10 = (int) Math.min(j10, i10);
                } catch (IOException e3) {
                    throw new d(e3, 2000);
                }
            }
            FileInputStream fileInputStream = this.f31142u;
            String str = m3.z.f28608a;
            int i11 = fileInputStream.read(bArr, i, i10);
            if (i11 != -1) {
                long j11 = this.f31143v;
                if (j11 != -1) {
                    this.f31143v = j11 - ((long) i11);
                }
                bytesTransferred(i11);
                return i11;
            }
        }
        return -1;
    }
}
