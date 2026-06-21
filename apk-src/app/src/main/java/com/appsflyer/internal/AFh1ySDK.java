package com.appsflyer.internal;

import a0.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import t.z;

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
public abstract class AFh1ySDK {
    private final boolean shouldExtendMsg;
    public static final Companion Companion = new Companion(null);
    public static long AFAdRevenueData = System.currentTimeMillis();

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void d$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, boolean z5, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z5 = true;
        }
        aFh1ySDK.d(aFg1cSDK, str, z5);
    }

    public static /* synthetic */ void e$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, Throwable th2, boolean z5, boolean z10, boolean z11, boolean z12, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 8) != 0) {
            z5 = true;
        }
        if ((i & 16) != 0) {
            z10 = true;
        }
        if ((i & 32) != 0) {
            z11 = true;
        }
        if ((i & 64) != 0) {
            z12 = true;
        }
        aFh1ySDK.e(aFg1cSDK, str, th2, z5, z10, z11, z12);
    }

    public static /* synthetic */ void i$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, boolean z5, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z5 = true;
        }
        aFh1ySDK.i(aFg1cSDK, str, z5);
    }

    public static /* synthetic */ void v$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, boolean z5, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z5 = true;
        }
        aFh1ySDK.v(aFg1cSDK, str, z5);
    }

    public static /* synthetic */ void w$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, boolean z5, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i & 4) != 0) {
            z5 = true;
        }
        aFh1ySDK.w(aFg1cSDK, str, z5);
    }

    public void d(AFg1cSDK aFg1cSDK, String str, boolean z5) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void e(AFg1cSDK aFg1cSDK, String str, Throwable th2, boolean z5, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
    }

    public void force(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public final String getMediationNetwork(String str, AFg1cSDK aFg1cSDK) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        if (str == null || StringsKt.D(str)) {
            str = "null";
        }
        String strWithTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFg1cSDK);
        if (!getShouldExtendMsg()) {
            return strWithTag$SDK_prodRelease;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - AFAdRevenueData;
        String name = Thread.currentThread().getName();
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(jCurrentTimeMillis);
        sb2.append(") [");
        sb2.append(name);
        return u.o(sb2, "] ", strWithTag$SDK_prodRelease);
    }

    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    public void i(AFg1cSDK aFg1cSDK, String str, boolean z5) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void v(AFg1cSDK aFg1cSDK, String str, boolean z5) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void w(AFg1cSDK aFg1cSDK, String str, boolean z5) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public final String withTag$SDK_prodRelease(String str, AFg1cSDK aFg1cSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        return z.e("[", aFg1cSDK.getCurrencyIso4217Code, "] ", str);
    }

    public final void d(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        d$default(this, aFg1cSDK, str, false, 4, null);
    }

    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th2) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFg1cSDK, str, th2, false, false, false, false, 120, null);
    }

    public final void i(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        i$default(this, aFg1cSDK, str, false, 4, null);
    }

    public final void v(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        v$default(this, aFg1cSDK, str, false, 4, null);
    }

    public final void w(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        w$default(this, aFg1cSDK, str, false, 4, null);
    }

    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th2, boolean z5) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFg1cSDK, str, th2, z5, false, false, false, 112, null);
    }

    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th2, boolean z5, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFg1cSDK, str, th2, z5, z10, false, false, 96, null);
    }

    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th2, boolean z5, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFg1cSDK, str, th2, z5, z10, z11, false, 64, null);
    }
}
