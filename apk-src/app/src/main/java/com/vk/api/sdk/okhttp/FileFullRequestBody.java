package com.vk.api.sdk.okhttp;

import a.a;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import com.vk.api.sdk.exceptions.VKLocalIOException;
import hl.l;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLConnection;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nl.h;
import zk.b0;
import zk.p;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class FileFullRequestBody extends b0 {
    private static final int CHUNK = 8192;
    public static final Companion Companion = new Companion(null);
    private final Context context;
    private final String lastPathSegment;
    private final String scheme;
    private final Uri uri;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FileFullRequestBody(Context context, Uri uri) {
        String lastPathSegment;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.context = context;
        this.uri = uri;
        String scheme = uri.getScheme();
        if (scheme == null || StringsKt.D(scheme) || (lastPathSegment = uri.getLastPathSegment()) == null || StringsKt.D(lastPathSegment)) {
            throw new IllegalArgumentException("Illegal fileUri value: '" + uri + '\'');
        }
        String scheme2 = uri.getScheme();
        Intrinsics.b(scheme2);
        Intrinsics.checkNotNullExpressionValue(scheme2, "uri.scheme!!");
        this.scheme = scheme2;
        String lastPathSegment2 = uri.getLastPathSegment();
        Intrinsics.b(lastPathSegment2);
        Intrinsics.checkNotNullExpressionValue(lastPathSegment2, "uri.lastPathSegment!!");
        this.lastPathSegment = lastPathSegment2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // zk.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long contentLength() throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r1 = r5.context     // Catch: java.lang.Throwable -> L39 java.io.FileNotFoundException -> L3e
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L39 java.io.FileNotFoundException -> L3e
            android.net.Uri r2 = r5.uri     // Catch: java.lang.Throwable -> L39 java.io.FileNotFoundException -> L3e
            java.lang.String r3 = "r"
            android.content.res.AssetFileDescriptor r1 = r1.openAssetFileDescriptor(r2, r3)     // Catch: java.lang.Throwable -> L39 java.io.FileNotFoundException -> L3e
            if (r1 != 0) goto L12
            goto L1a
        L12:
            long r2 = r1.getLength()     // Catch: java.lang.Throwable -> L27 java.io.FileNotFoundException -> L29
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L27 java.io.FileNotFoundException -> L29
        L1a:
            if (r0 == 0) goto L2b
            long r2 = r0.longValue()     // Catch: java.lang.Throwable -> L27 java.io.FileNotFoundException -> L29
            if (r1 != 0) goto L23
            return r2
        L23:
            r1.close()     // Catch: java.lang.Exception -> L26
        L26:
            return r2
        L27:
            r0 = move-exception
            goto L48
        L29:
            r0 = move-exception
            goto L42
        L2b:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L27 java.io.FileNotFoundException -> L29
            java.lang.String r2 = "Cannot open uri: "
            android.net.Uri r3 = r5.uri     // Catch: java.lang.Throwable -> L27 java.io.FileNotFoundException -> L29
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.f(r3, r2)     // Catch: java.lang.Throwable -> L27 java.io.FileNotFoundException -> L29
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L27 java.io.FileNotFoundException -> L29
            throw r0     // Catch: java.lang.Throwable -> L27 java.io.FileNotFoundException -> L29
        L39:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L48
        L3e:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L42:
            com.vk.api.sdk.exceptions.VKLocalIOException r2 = new com.vk.api.sdk.exceptions.VKLocalIOException     // Catch: java.lang.Throwable -> L27
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L27
            throw r2     // Catch: java.lang.Throwable -> L27
        L48:
            if (r1 != 0) goto L4b
            goto L4e
        L4b:
            r1.close()     // Catch: java.lang.Exception -> L4e
        L4e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.api.sdk.okhttp.FileFullRequestBody.contentLength():long");
    }

    @Override // zk.b0
    public p contentType() {
        String string;
        p pVarL = null;
        try {
            string = URLConnection.guessContentTypeFromName(this.lastPathSegment);
        } catch (Exception unused) {
            string = null;
        }
        if (string == null) {
            try {
                Cursor cursorQuery = this.context.getContentResolver().query(this.uri, new String[]{"mime_type"}, null, null, null);
                if (cursorQuery != null) {
                    Cursor cursor = cursorQuery;
                    try {
                        Cursor cursor2 = cursor;
                        string = cursor2.isNull(0) ? null : cursor2.getString(0);
                        Unit unit = Unit.f27471a;
                        cursor.close();
                    } catch (Throwable th2) {
                        String str = string;
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            try {
                                l.g(cursor, th2);
                                throw th3;
                            } catch (Throwable unused2) {
                                string = str;
                            }
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
        }
        if (string != null) {
            Pattern pattern = p.f46432d;
            pVarL = a.l(string);
        }
        if (pVarL != null) {
            return pVarL;
        }
        Pattern pattern2 = p.f46432d;
        return a.h("application/octet-stream");
    }

    @Override // zk.b0
    public void writeTo(h sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        OutputStream outputStreamG = sink.G();
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = null;
        try {
            try {
                assetFileDescriptorOpenAssetFileDescriptor = this.context.getContentResolver().openAssetFileDescriptor(this.uri, "r");
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    throw new FileNotFoundException(Intrinsics.f(this.uri, "Cannot open uri: "));
                }
                FileInputStream fileInputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                Intrinsics.checkNotNullExpressionValue(fileInputStreamCreateInputStream, "fileDescriptor.createInputStream()");
                byte[] bArr = new byte[CHUNK];
                while (fileInputStreamCreateInputStream.available() > 0) {
                    try {
                        int i = fileInputStreamCreateInputStream.read(bArr);
                        if (i != -1) {
                            outputStreamG.write(bArr, 0, i);
                            outputStreamG.flush();
                        }
                    } catch (IOException e3) {
                        throw new VKLocalIOException(e3);
                    }
                }
                try {
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                } catch (Exception unused) {
                }
            } catch (IOException e7) {
                throw new VKLocalIOException(e7);
            }
        } catch (Throwable th2) {
            if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                try {
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
    }
}
