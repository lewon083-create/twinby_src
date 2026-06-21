package p3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f31125r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l f31126s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AssetFileDescriptor f31127t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public FileInputStream f31128u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f31129v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f31130w;

    public b0(Context context) {
        super(false);
        this.f31125r = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // p3.h
    public final void close() {
        this.f31126s = null;
        try {
            try {
                FileInputStream fileInputStream = this.f31128u;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f31128u = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f31127t;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e3) {
                        throw new a0(null, e3, 2000);
                    }
                } finally {
                    this.f31127t = null;
                    if (this.f31130w) {
                        this.f31130w = false;
                        transferEnded();
                    }
                }
            } catch (Throwable th2) {
                this.f31128u = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f31127t;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f31127t = null;
                        if (this.f31130w) {
                            this.f31130w = false;
                            transferEnded();
                        }
                        throw th2;
                    } finally {
                        this.f31127t = null;
                        if (this.f31130w) {
                            this.f31130w = false;
                            transferEnded();
                        }
                    }
                } catch (IOException e7) {
                    throw new a0(null, e7, 2000);
                }
            }
        } catch (IOException e10) {
            throw new a0(null, e10, 2000);
        }
    }

    @Override // p3.h
    public final Uri getUri() {
        l lVar = this.f31126s;
        if (lVar != null) {
            return lVar.f31172a;
        }
        return null;
    }

    @Override // p3.h
    public final long open(l lVar) throws a0 {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        this.f31126s = lVar;
        transferInitializing(lVar);
        Uri uri = lVar.f31172a;
        long j10 = lVar.f31178g;
        long j11 = lVar.f31177f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f31125r;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new a0("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new a0("Resource identifier must be an integer.", null, VKApiCodes.CODE_PHONE_ALREADY_USED);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new a0("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, VKApiCodes.CODE_PHONE_ALREADY_USED);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e3) {
                    throw new a0("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e3, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new a0("Resource identifier must be an integer.", null, VKApiCodes.CODE_PHONE_ALREADY_USED);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(gf.a.k(packageName, StringUtils.PROCESS_POSTFIX_DELIMITER, path), "raw", null);
                if (identifier == 0) {
                    throw new a0("Resource not found.", null, 2005);
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new a0("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.f31127t = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f31127t.getFileDescriptor());
            this.f31128u = fileInputStream;
            try {
                if (length != -1 && j11 > length) {
                    throw new a0(null, null, 2008);
                }
                long startOffset = this.f31127t.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j11) - startOffset;
                if (jSkip != j11) {
                    throw new a0(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f31129v = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f31129v = size;
                        if (size < 0) {
                            throw new a0(null, null, 2008);
                        }
                    }
                } else {
                    long j12 = length - jSkip;
                    this.f31129v = j12;
                    if (j12 < 0) {
                        throw new i(2008);
                    }
                }
                if (j10 != -1) {
                    long j13 = this.f31129v;
                    this.f31129v = j13 == -1 ? j10 : Math.min(j13, j10);
                }
                this.f31130w = true;
                transferStarted(lVar);
                return j10 != -1 ? j10 : this.f31129v;
            } catch (a0 e7) {
                throw e7;
            } catch (IOException e10) {
                throw new a0(null, e10, 2000);
            }
        } catch (Resources.NotFoundException e11) {
            throw new a0(null, e11, 2005);
        }
    }

    @Override // j3.h
    public final int read(byte[] bArr, int i, int i10) throws a0 {
        if (i10 == 0) {
            return 0;
        }
        long j10 = this.f31129v;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i10 = (int) Math.min(j10, i10);
                } catch (IOException e3) {
                    throw new a0(null, e3, 2000);
                }
            }
            FileInputStream fileInputStream = this.f31128u;
            String str = m3.z.f28608a;
            int i11 = fileInputStream.read(bArr, i, i10);
            if (i11 != -1) {
                long j11 = this.f31129v;
                if (j11 != -1) {
                    this.f31129v = j11 - ((long) i11);
                }
                bytesTransferred(i11);
                return i11;
            }
            if (this.f31129v != -1) {
                throw new a0("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}
