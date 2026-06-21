package com.appsflyer.internal;

import a0.u;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;

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
public abstract class AFe1rSDK {
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);
    private static final List<String> getMediationNetwork = s.f(AFInAppEventType.ACHIEVEMENT_UNLOCKED, AFInAppEventType.AD_CLICK, AFInAppEventType.AD_VIEW, AFInAppEventType.ADD_PAYMENT_INFO, AFInAppEventType.ADD_TO_CART, AFInAppEventType.ADD_TO_WISH_LIST, AFInAppEventType.COMPLETE_REGISTRATION, AFInAppEventType.CONTENT_VIEW, AFInAppEventType.INITIATED_CHECKOUT, AFInAppEventType.INVITE, AFInAppEventType.LEVEL_ACHIEVED, AFInAppEventType.LIST_VIEW, AFInAppEventType.LOGIN, AFInAppEventType.OPENED_FROM_PUSH_NOTIFICATION, AFInAppEventType.PURCHASE, AFInAppEventType.RATE, AFInAppEventType.RE_ENGAGE, AFInAppEventType.SEARCH, AFInAppEventType.SHARE, AFInAppEventType.SPENT_CREDIT, AFInAppEventType.START_TRIAL, AFInAppEventType.SUBSCRIBE, AFInAppEventType.TRAVEL_BOOKING, AFInAppEventType.TUTORIAL_COMPLETION, AFInAppEventType.UPDATE);
    public final String getRevenue;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AFa1tSDK extends AFe1rSDK {
        public static final AFa1tSDK INSTANCE = new AFa1tSDK();

        private AFa1tSDK() {
            super("install");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AFa1uSDK extends AFe1rSDK {
        public static final AFa1uSDK INSTANCE = new AFa1uSDK();

        private AFa1uSDK() {
            super("af_sandbox_revenue");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public static AFe1rSDK getMediationNetwork(AFh1mSDK aFh1mSDK) {
            String string;
            Object obj;
            String string2;
            Intrinsics.checkNotNullParameter(aFh1mSDK, "");
            if (aFh1mSDK.AFAdRevenueData() == AFe1pSDK.CONVERSION) {
                return AFa1tSDK.INSTANCE;
            }
            Integer intOrNull = null;
            if (aFh1mSDK.AFAdRevenueData() != AFe1pSDK.INAPP || !AFe1rSDK.getMediationNetwork.contains(aFh1mSDK.areAllFieldsValid)) {
                return null;
            }
            Map<String, Object> map = aFh1mSDK.getRevenue;
            Float fE = (map == null || (obj = map.get(AFInAppEventParameterName.REVENUE)) == null || (string2 = obj.toString()) == null) ? null : z.e(string2);
            Object obj2 = aFh1mSDK.AFAdRevenueData.get("iaecounter");
            if (obj2 != null && (string = obj2.toString()) != null) {
                intOrNull = StringsKt.toIntOrNull(string);
            }
            String str = aFh1mSDK.areAllFieldsValid;
            Intrinsics.checkNotNullExpressionValue(str, "");
            return new AFa1zSDK(str, fE, intOrNull);
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class AFa1zSDK extends AFe1rSDK {
        public final Integer AFAdRevenueData;
        public final Float getCurrencyIso4217Code;
        private final String getMediationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AFa1zSDK(String str, Float f10, Integer num) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
            this.getMediationNetwork = str;
            this.getCurrencyIso4217Code = f10;
            this.AFAdRevenueData = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1zSDK)) {
                return false;
            }
            AFa1zSDK aFa1zSDK = (AFa1zSDK) obj;
            return Intrinsics.a(this.getMediationNetwork, aFa1zSDK.getMediationNetwork) && Intrinsics.a(this.getCurrencyIso4217Code, aFa1zSDK.getCurrencyIso4217Code) && Intrinsics.a(this.AFAdRevenueData, aFa1zSDK.AFAdRevenueData);
        }

        public final int hashCode() {
            int iHashCode = this.getMediationNetwork.hashCode() * 31;
            Float f10 = this.getCurrencyIso4217Code;
            int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
            Integer num = this.AFAdRevenueData;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            String str = this.getMediationNetwork;
            Float f10 = this.getCurrencyIso4217Code;
            Integer num = this.AFAdRevenueData;
            StringBuilder sb2 = new StringBuilder("PredefinedInAppEvent(name=");
            sb2.append(str);
            sb2.append(", eventRevenue=");
            sb2.append(f10);
            sb2.append(", eventCounter=");
            return u.m(sb2, num, ")");
        }
    }

    public AFe1rSDK(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getRevenue = str;
    }
}
