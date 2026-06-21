package com.appsflyer;

import a0.d1;
import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFh1ySDK;
import ij.g;
import ij.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import kotlin.text.StringsKt;

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
public final class AFLogger extends AFh1ySDK {
    public static final AFLogger INSTANCE = new AFLogger();
    private static final g getMediationNetwork = h.b(AnonymousClass7.getRevenue);
    private static final g getCurrencyIso4217Code = h.b(AnonymousClass5.AFAdRevenueData);

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass1 extends r implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ boolean $AFAdRevenueData;
        private /* synthetic */ String $getCurrencyIso4217Code;
        private /* synthetic */ AFg1cSDK $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AFg1cSDK aFg1cSDK, String str, boolean z5) {
            super(1);
            this.$getMonetizationNetwork = aFg1cSDK;
            this.$getCurrencyIso4217Code = str;
            this.$AFAdRevenueData = z5;
        }

        public final void AFAdRevenueData(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.i(this.$getMonetizationNetwork, this.$getCurrencyIso4217Code, this.$AFAdRevenueData);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFAdRevenueData((AFh1ySDK) obj);
            return Unit.f27471a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$10, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass10 extends r implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ String $getCurrencyIso4217Code;
        private /* synthetic */ AFg1cSDK $getMonetizationNetwork;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(AFg1cSDK aFg1cSDK, String str, boolean z5) {
            super(1);
            this.$getMonetizationNetwork = aFg1cSDK;
            this.$getCurrencyIso4217Code = str;
            this.$getRevenue = z5;
        }

        public final void getMediationNetwork(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.v(this.$getMonetizationNetwork, this.$getCurrencyIso4217Code, this.$getRevenue);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMediationNetwork((AFh1ySDK) obj);
            return Unit.f27471a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass2 extends r implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ boolean $getCurrencyIso4217Code;
        private /* synthetic */ AFg1cSDK $getMonetizationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AFg1cSDK aFg1cSDK, String str, boolean z5) {
            super(1);
            this.$getMonetizationNetwork = aFg1cSDK;
            this.$getRevenue = str;
            this.$getCurrencyIso4217Code = z5;
        }

        public final void getCurrencyIso4217Code(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.d(this.$getMonetizationNetwork, this.$getRevenue, this.$getCurrencyIso4217Code);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getCurrencyIso4217Code((AFh1ySDK) obj);
            return Unit.f27471a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass3 extends r implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ String $AFAdRevenueData;
        private /* synthetic */ boolean $areAllFieldsValid;
        private /* synthetic */ boolean $component1;
        private /* synthetic */ AFg1cSDK $getCurrencyIso4217Code;
        private /* synthetic */ boolean $getMediationNetwork;
        private /* synthetic */ Throwable $getMonetizationNetwork;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AFg1cSDK aFg1cSDK, String str, Throwable th2, boolean z5, boolean z10, boolean z11, boolean z12) {
            super(1);
            this.$getCurrencyIso4217Code = aFg1cSDK;
            this.$AFAdRevenueData = str;
            this.$getMonetizationNetwork = th2;
            this.$getMediationNetwork = z5;
            this.$getRevenue = z10;
            this.$component1 = z11;
            this.$areAllFieldsValid = z12;
        }

        public final void getRevenue(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.e(this.$getCurrencyIso4217Code, this.$AFAdRevenueData, this.$getMonetizationNetwork, this.$getMediationNetwork, this.$getRevenue, this.$component1, this.$areAllFieldsValid);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getRevenue((AFh1ySDK) obj);
            return Unit.f27471a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass4 extends r implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ AFg1cSDK $getMonetizationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AFg1cSDK aFg1cSDK, String str) {
            super(1);
            this.$getMonetizationNetwork = aFg1cSDK;
            this.$getRevenue = str;
        }

        public final void getMonetizationNetwork(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.force(this.$getMonetizationNetwork, this.$getRevenue);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMonetizationNetwork((AFh1ySDK) obj);
            return Unit.f27471a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass5 extends r implements Function0<ExecutorService> {
        public static final AnonymousClass5 AFAdRevenueData = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return AFc1kSDK.getMediationNetwork();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass7 extends r implements Function0<Set<AFh1ySDK>> {
        public static final AnonymousClass7 getRevenue = new AnonymousClass7();

        public AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final Set<AFh1ySDK> invoke() {
            return new LinkedHashSet();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$9, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass9 extends r implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ String $AFAdRevenueData;
        private /* synthetic */ AFg1cSDK $getMediationNetwork;
        private /* synthetic */ boolean $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(AFg1cSDK aFg1cSDK, String str, boolean z5) {
            super(1);
            this.$getMediationNetwork = aFg1cSDK;
            this.$AFAdRevenueData = str;
            this.$getMonetizationNetwork = z5;
        }

        public final void AFAdRevenueData(AFh1ySDK aFh1ySDK) {
            Intrinsics.checkNotNullParameter(aFh1ySDK, "");
            aFh1ySDK.w(this.$getMediationNetwork, this.$AFAdRevenueData, this.$getMonetizationNetwork);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFAdRevenueData((AFh1ySDK) obj);
            return Unit.f27471a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        LogLevel(int i) {
            this.level = i;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    public static final void afDebugLog(String str, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.d(AFg1cSDK.OTHER, str, z5);
    }

    public static final void afErrorLog(String str, Throwable th2, boolean z5, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        AFh1ySDK.e$default(INSTANCE, AFg1cSDK.OTHER, str, th2, z5, z10, z11, false, 64, null);
    }

    public static final void afErrorLogForExcManagerOnly(String str, Throwable th2) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.D(str)) {
            str = "null";
        }
        String str2 = str;
        if (th2 == null) {
            th2 = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str2, th2, false, false, true, false, 64, null);
    }

    public static final void afInfoLog(String str, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.i(AFg1cSDK.OTHER, str, z5);
    }

    public static final void afLogForce(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.force(AFg1cSDK.OTHER, str);
    }

    public static final void afRDLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.v(AFg1cSDK.OTHER, str, true);
    }

    public static final void afVerboseLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.v(AFg1cSDK.OTHER, str, false);
    }

    public static final void afWarnLog(String str, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.w(AFg1cSDK.OTHER, str, z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFh1ySDK[] aFh1ySDKArr) {
        Intrinsics.checkNotNullParameter(aFh1ySDKArr, "");
        x.n((Set) getMediationNetwork.getValue(), aFh1ySDKArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFh1ySDK[] aFh1ySDKArr) {
        Intrinsics.checkNotNullParameter(aFh1ySDKArr, "");
        ((Set) getMediationNetwork.getValue()).removeAll(p.w(aFh1ySDKArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator it = ((Set) getMediationNetwork.getValue()).iterator();
        while (it.hasNext()) {
            function1.invoke((AFh1ySDK) it.next());
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void d(AFg1cSDK aFg1cSDK, String str, boolean z5) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new d1(9, new AnonymousClass2(aFg1cSDK, str, z5)));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th2, boolean z5, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new d1(9, new AnonymousClass3(aFg1cSDK, str, th2, z5, z10, z11, z12)));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void force(AFg1cSDK aFg1cSDK, String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new d1(9, new AnonymousClass4(aFg1cSDK, str)));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void i(AFg1cSDK aFg1cSDK, String str, boolean z5) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new d1(9, new AnonymousClass1(aFg1cSDK, str, z5)));
    }

    public final void registerClient(AFh1ySDK... aFh1ySDKArr) {
        Intrinsics.checkNotNullParameter(aFh1ySDKArr, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new a(aFh1ySDKArr, 1));
    }

    public final void unregisterClient(AFh1ySDK... aFh1ySDKArr) {
        Intrinsics.checkNotNullParameter(aFh1ySDKArr, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new a(aFh1ySDKArr, 0));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void v(AFg1cSDK aFg1cSDK, String str, boolean z5) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new d1(9, new AnonymousClass10(aFg1cSDK, str, z5)));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void w(AFg1cSDK aFg1cSDK, String str, boolean z5) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new d1(9, new AnonymousClass9(aFg1cSDK, str, z5)));
    }

    public static final void afDebugLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.d(AFg1cSDK.OTHER, str, true);
    }

    public static final void afInfoLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.i(AFg1cSDK.OTHER, str, true);
    }

    public static final void afWarnLog(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AFh1ySDK.w$default(INSTANCE, AFg1cSDK.OTHER, str, false, 4, null);
    }

    public static final void afErrorLog(String str, Throwable th2) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.D(str)) {
            str = "null";
        }
        String str2 = str;
        if (th2 == null) {
            th2 = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str2, th2, false, false, false, false, 120, null);
    }

    public static final void afErrorLogForExcManagerOnly(String str, Throwable th2, boolean z5) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.D(str)) {
            str = "null";
        }
        String str2 = str;
        if (th2 == null) {
            th2 = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str2, th2, false, false, !z5, false, 64, null);
    }

    public static final void afErrorLog(String str, Throwable th2, boolean z5) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.D(str)) {
            str = "null";
        }
        String str2 = str;
        if (th2 == null) {
            th2 = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str2, th2, false, z5, false, false, 104, null);
    }

    public static final void afErrorLog(String str, Throwable th2, boolean z5, boolean z10) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.D(str)) {
            str = "null";
        }
        String str2 = str;
        if (th2 == null) {
            th2 = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str2, th2, false, z5, z10, false, 72, null);
    }
}
