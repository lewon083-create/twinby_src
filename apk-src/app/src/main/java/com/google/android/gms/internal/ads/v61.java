package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v61 extends h41 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f11278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f11279h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f11281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f11282l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v61(Context context, int i) {
        super(false);
        this.f11277f = i;
        switch (i) {
            case 1:
                super(false);
                this.f11281k = context.getApplicationContext();
                break;
            default:
                this.f11281k = context.getContentResolver();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.ct1
    public final int C(byte[] bArr, int i, int i10) throws yk1, j61 {
        switch (this.f11277f) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                long j10 = this.i;
                if (j10 != 0) {
                    if (j10 != -1) {
                        try {
                            i10 = (int) Math.min(j10, i10);
                        } catch (IOException e3) {
                            throw new j61(e3, 2000);
                        }
                    }
                    FileInputStream fileInputStream = this.f11279h;
                    String str = cq0.f4293a;
                    int i11 = fileInputStream.read(bArr, i, i10);
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
            default:
                if (i10 == 0) {
                    return 0;
                }
                long j12 = this.i;
                if (j12 != 0) {
                    if (j12 != -1) {
                        try {
                            i10 = (int) Math.min(j12, i10);
                        } catch (IOException e7) {
                            throw new yk1(null, e7, 2000);
                        }
                    }
                    FileInputStream fileInputStream2 = this.f11279h;
                    String str2 = cq0.f4293a;
                    int i12 = fileInputStream2.read(bArr, i, i10);
                    if (i12 != -1) {
                        long j13 = this.i;
                        if (j13 != -1) {
                            this.i = j13 - ((long) i12);
                        }
                        c(i12);
                        return i12;
                    }
                    if (this.i != -1) {
                        throw new yk1("End of stream reached having not read sufficient data.", new EOFException(), 2000);
                    }
                }
                return -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void g() {
        switch (this.f11277f) {
            case 0:
                this.f11282l = null;
                try {
                    try {
                        try {
                            FileInputStream fileInputStream = this.f11279h;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            this.f11279h = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor = this.f11278g;
                                if (assetFileDescriptor != null) {
                                    assetFileDescriptor.close();
                                    break;
                                }
                                this.f11278g = null;
                                if (this.f11280j) {
                                    this.f11280j = false;
                                    f();
                                    return;
                                }
                                return;
                            } catch (IOException e3) {
                                throw new j61(e3, 2000);
                            }
                        } catch (Throwable th2) {
                            this.f11279h = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor2 = this.f11278g;
                                if (assetFileDescriptor2 != null) {
                                    assetFileDescriptor2.close();
                                    break;
                                }
                                this.f11278g = null;
                                if (this.f11280j) {
                                    this.f11280j = false;
                                    f();
                                }
                                throw th2;
                            } catch (IOException e7) {
                                throw new j61(e7, 2000);
                            }
                        }
                    } catch (Throwable th3) {
                        this.f11278g = null;
                        if (this.f11280j) {
                            this.f11280j = false;
                            f();
                        }
                        throw th3;
                    }
                } catch (IOException e10) {
                    throw new j61(e10, 2000);
                }
            default:
                this.f11282l = null;
                try {
                    try {
                        try {
                            FileInputStream fileInputStream2 = this.f11279h;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            this.f11279h = null;
                            try {
                                AssetFileDescriptor assetFileDescriptor3 = this.f11278g;
                                if (assetFileDescriptor3 != null) {
                                    assetFileDescriptor3.close();
                                    break;
                                }
                                this.f11278g = null;
                                if (this.f11280j) {
                                    this.f11280j = false;
                                    f();
                                    return;
                                }
                                return;
                            } catch (IOException e11) {
                                throw new yk1(null, e11, 2000);
                            }
                        } catch (IOException e12) {
                            throw new yk1(null, e12, 2000);
                        }
                    } catch (Throwable th4) {
                        this.f11278g = null;
                        if (this.f11280j) {
                            this.f11280j = false;
                            f();
                        }
                        throw th4;
                    }
                    break;
                } catch (Throwable th5) {
                    this.f11279h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor4 = this.f11278g;
                        if (assetFileDescriptor4 != null) {
                            assetFileDescriptor4.close();
                            break;
                        }
                        this.f11278g = null;
                        if (this.f11280j) {
                            this.f11280j = false;
                            f();
                        }
                        throw th5;
                    } catch (IOException e13) {
                        throw new yk1(null, e13, 2000);
                    }
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long k(db1 db1Var) throws yk1, j61 {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        Resources resourcesForApplication;
        int identifier;
        long size;
        switch (this.f11277f) {
            case 0:
                ContentResolver contentResolver = (ContentResolver) this.f11281k;
                try {
                    try {
                        Uri uri = db1Var.f4544a;
                        long j10 = db1Var.f4546c;
                        Uri uriNormalizeScheme = uri.normalizeScheme();
                        this.f11282l = uriNormalizeScheme;
                        a(db1Var);
                        if (Objects.equals(uriNormalizeScheme.getScheme(), "content")) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                        } else {
                            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                        }
                        this.f11278g = assetFileDescriptorOpenAssetFileDescriptor;
                        if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                            String strValueOf = String.valueOf(uriNormalizeScheme);
                            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 36);
                            sb2.append("Could not open file descriptor for: ");
                            sb2.append(strValueOf);
                            i = 2000;
                            try {
                                throw new j61(new IOException(sb2.toString()), 2000);
                            } catch (IOException e3) {
                                e = e3;
                                throw new j61(e, true != (e instanceof FileNotFoundException) ? i : 2005);
                            }
                        }
                        long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                        FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                        this.f11279h = fileInputStream;
                        if (length != -1 && j10 > length) {
                            throw new j61(null, 2008);
                        }
                        long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                        long jSkip = fileInputStream.skip(startOffset + j10) - startOffset;
                        if (jSkip != j10) {
                            throw new j61(null, 2008);
                        }
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size2 = channel.size();
                            if (size2 == 0) {
                                this.i = -1L;
                                jPosition = -1;
                            } else {
                                jPosition = size2 - channel.position();
                                this.i = jPosition;
                                if (jPosition < 0) {
                                    throw new j61(null, 2008);
                                }
                            }
                        } else {
                            jPosition = length - jSkip;
                            this.i = jPosition;
                            if (jPosition < 0) {
                                throw new j61(null, 2008);
                            }
                        }
                        long j11 = db1Var.f4547d;
                        if (j11 != -1) {
                            this.i = jPosition == -1 ? j11 : Math.min(jPosition, j11);
                        }
                        this.f11280j = true;
                        b(db1Var);
                        return j11 != -1 ? j11 : this.i;
                    } catch (IOException e7) {
                        e = e7;
                        i = 2000;
                    }
                } catch (j61 e10) {
                    throw e10;
                }
                break;
            default:
                this.f11282l = db1Var;
                a(db1Var);
                Context context = (Context) this.f11281k;
                Uri uri2 = db1Var.f4544a;
                long j12 = db1Var.f4546c;
                Uri uriNormalizeScheme2 = uri2.normalizeScheme();
                if (TextUtils.equals("rawresource", uriNormalizeScheme2.getScheme())) {
                    resourcesForApplication = context.getResources();
                    List<String> pathSegments = uriNormalizeScheme2.getPathSegments();
                    if (pathSegments.size() != 1) {
                        int size3 = pathSegments.size();
                        throw new yk1(l7.o.j(size3, "rawresource:// URI must have exactly one path element, found ", new StringBuilder(String.valueOf(size3).length() + 61)), null, 2000);
                    }
                    try {
                        identifier = Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused) {
                        throw new yk1("Resource identifier must be an integer.", null, VKApiCodes.CODE_PHONE_ALREADY_USED);
                    }
                } else {
                    if (!TextUtils.equals("android.resource", uriNormalizeScheme2.getScheme())) {
                        String scheme = uriNormalizeScheme2.getScheme();
                        throw new yk1(t.z.g(new StringBuilder(String.valueOf(scheme).length() + 62), "Unsupported URI scheme (", scheme, "). Only android.resource is supported."), null, VKApiCodes.CODE_PHONE_ALREADY_USED);
                    }
                    String path = uriNormalizeScheme2.getPath();
                    path.getClass();
                    if (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    String packageName = TextUtils.isEmpty(uriNormalizeScheme2.getHost()) ? context.getPackageName() : uriNormalizeScheme2.getHost();
                    if (packageName.equals(context.getPackageName())) {
                        resourcesForApplication = context.getResources();
                    } else {
                        try {
                            resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                        } catch (PackageManager.NameNotFoundException e11) {
                            throw new yk1("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e11, 2005);
                        }
                    }
                    if (path.matches("\\d+")) {
                        try {
                            identifier = Integer.parseInt(path);
                        } catch (NumberFormatException unused2) {
                            throw new yk1("Resource identifier must be an integer.", null, VKApiCodes.CODE_PHONE_ALREADY_USED);
                        }
                    } else {
                        identifier = resourcesForApplication.getIdentifier(t.z.g(new StringBuilder(packageName.length() + 1 + path.length()), packageName, StringUtils.PROCESS_POSTFIX_DELIMITER, path), "raw", null);
                        if (identifier == 0) {
                            throw new yk1("Resource not found.", null, 2005);
                        }
                    }
                }
                try {
                    AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
                    if (assetFileDescriptorOpenRawResourceFd == null) {
                        throw new yk1("Resource is compressed: ".concat(String.valueOf(uriNormalizeScheme2)), null, 2000);
                    }
                    this.f11278g = assetFileDescriptorOpenRawResourceFd;
                    long length2 = assetFileDescriptorOpenRawResourceFd.getLength();
                    FileInputStream fileInputStream2 = new FileInputStream(this.f11278g.getFileDescriptor());
                    this.f11279h = fileInputStream2;
                    try {
                        if (length2 != -1 && j12 > length2) {
                            throw new yk1(null, null, 2008);
                        }
                        long startOffset2 = this.f11278g.getStartOffset();
                        long jSkip2 = fileInputStream2.skip(startOffset2 + j12) - startOffset2;
                        if (jSkip2 != j12) {
                            throw new yk1(null, null, 2008);
                        }
                        if (length2 == -1) {
                            FileChannel channel2 = fileInputStream2.getChannel();
                            if (channel2.size() == 0) {
                                this.i = -1L;
                                size = -1;
                            } else {
                                size = channel2.size() - channel2.position();
                                this.i = size;
                                if (size < 0) {
                                    throw new yk1(null, null, 2008);
                                }
                            }
                        } else {
                            size = length2 - jSkip2;
                            this.i = size;
                            if (size < 0) {
                                throw new t91();
                            }
                        }
                        long j13 = db1Var.f4547d;
                        if (j13 != -1) {
                            this.i = size == -1 ? j13 : Math.min(size, j13);
                        }
                        this.f11280j = true;
                        b(db1Var);
                        return j13 != -1 ? j13 : this.i;
                    } catch (yk1 e12) {
                        throw e12;
                    } catch (IOException e13) {
                        throw new yk1(null, e13, 2000);
                    }
                } catch (Resources.NotFoundException e14) {
                    throw new yk1(null, e14, 2005);
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final Uri l() {
        switch (this.f11277f) {
            case 0:
                return (Uri) this.f11282l;
            default:
                db1 db1Var = (db1) this.f11282l;
                if (db1Var != null) {
                    return db1Var.f4544a;
                }
                return null;
        }
    }
}
