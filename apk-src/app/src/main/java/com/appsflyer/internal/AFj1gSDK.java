package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import com.google.android.gms.internal.measurement.h5;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r;

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
public final class AFj1gSDK {
    final Intent getCurrencyIso4217Code;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1gSDK$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass2<T> extends r implements Function0<T> {
        private /* synthetic */ String $AFAdRevenueData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(0);
            this.$AFAdRevenueData = str;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: J_, reason: merged with bridge method [inline-methods] */
        public final Parcelable invoke() {
            return AFj1gSDK.this.getCurrencyIso4217Code.getParcelableExtra(this.$AFAdRevenueData);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1gSDK$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass3 extends r implements Function0<String> {
        private /* synthetic */ String $AFAdRevenueData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(0);
            this.$AFAdRevenueData = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AFj1gSDK.this.getCurrencyIso4217Code.getStringExtra(this.$AFAdRevenueData);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1gSDK$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass4 extends r implements Function0<Boolean> {
        private /* synthetic */ String $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str) {
            super(0);
            this.$getMonetizationNetwork = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AFj1gSDK.this.getCurrencyIso4217Code.hasExtra(this.$getMonetizationNetwork));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1gSDK$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass5 extends r implements Function0<Intent> {
        private /* synthetic */ long $AFAdRevenueData;
        private /* synthetic */ String $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, long j10) {
            super(0);
            this.$getMonetizationNetwork = str;
            this.$AFAdRevenueData = j10;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: K_, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return AFj1gSDK.this.getCurrencyIso4217Code.putExtra(this.$getMonetizationNetwork, this.$AFAdRevenueData);
        }
    }

    public AFj1gSDK(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.getCurrencyIso4217Code = intent;
    }

    public final String AFAdRevenueData(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) getMediationNetwork(new AnonymousClass3(str), pe.a.f("Error while trying to read ", str, " extra from intent"), null, true);
    }

    public final <T extends Parcelable> T H_(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) getMediationNetwork(new AnonymousClass2(str), pe.a.f("Error while trying to read ", str, " extra from intent"), null, true);
    }

    public final Intent I_(String str, long j10) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) getMediationNetwork(new AnonymousClass5(str, j10), pe.a.f("Error while trying to write ", str, " extra to intent"), null, true);
    }

    public final boolean getMediationNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) getMediationNetwork(new AnonymousClass4(str), pe.a.f("Error while trying to check presence of ", str, " extra from intent"), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final <T> T getMediationNetwork(Function0<? extends T> function0, String str, T t10, boolean z5) {
        Object objS;
        Object objS2;
        synchronized (this.getCurrencyIso4217Code) {
            try {
                ij.k kVar = ij.m.f21341c;
                objS = function0.invoke();
            } catch (Throwable th2) {
                ij.k kVar2 = ij.m.f21341c;
                objS = h5.s(th2);
            }
            dk.c[] cVarArr = {g0.a(ConcurrentModificationException.class), g0.a(ArrayIndexOutOfBoundsException.class)};
            Throwable thA = ij.m.a(objS);
            if (thA != null) {
                try {
                } catch (Throwable th3) {
                    ij.k kVar3 = ij.m.f21341c;
                    objS2 = h5.s(th3);
                }
                if (!p.k(cVarArr, g0.a(thA.getClass()))) {
                    throw thA;
                }
                if (z5) {
                    objS2 = getMediationNetwork(function0, str, t10, false);
                } else {
                    AFLogger.afErrorLog(str, thA, false, false);
                    objS2 = t10;
                }
                objS = objS2;
            }
            Throwable thA2 = ij.m.a(objS);
            if (thA2 == null) {
                t10 = (T) objS;
            } else {
                AFLogger.afErrorLog(str, thA2, false, false);
            }
        }
        return t10;
    }
}
