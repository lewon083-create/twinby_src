package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import kotlin.text.Charsets;
import kotlin.text.Regex;
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
public final class AFe1vSDK {
    private static AFe1ySDK component1;
    public final ij.g AFAdRevenueData;
    private final ij.g component2;
    private final AFc1qSDK getMediationNetwork;
    private final AFc1oSDK getRevenue;
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);
    public static String getMonetizationNetwork = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
    public static String getCurrencyIso4217Code = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
    private static final List<String> component4 = s.f("googleplay", "playstore", "googleplaystore");

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1vSDK$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass1 extends r implements Function0<String> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String packageName = AFe1vSDK.this.getRevenue.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            return AFe1vSDK.getMediationNetwork(packageName, AFe1vSDK.AFAdRevenueData(AFe1vSDK.this));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1vSDK$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass5 extends r implements Function0<String> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String strAFAdRevenueData = com.appsflyer.internal.AFa1ySDK.AFAdRevenueData(AFe1vSDK.this.getMediationNetwork, AFe1vSDK.this.getRevenue.component3());
            if (strAFAdRevenueData != null && !StringsKt.D(strAFAdRevenueData)) {
                String string = StringsKt.P(strAFAdRevenueData).toString();
                List<String> monetizationNetwork = AFa1ySDK.getMonetizationNetwork();
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = string.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (monetizationNetwork.contains(lowerCase)) {
                    String str = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{string}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    AFLogger.afWarnLog(str);
                    strAFAdRevenueData = "";
                } else {
                    strAFAdRevenueData = "-".concat(string);
                }
            }
            return StringsKt.P(strAFAdRevenueData != null ? strAFAdRevenueData : "").toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] AFAdRevenueData;

        static {
            int[] iArr = new int[AFe1tSDK.values().length];
            try {
                iArr[AFe1tSDK.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1tSDK.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFe1tSDK.RC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AFAdRevenueData = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public static List<String> getMonetizationNetwork() {
            return AFe1vSDK.component4;
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void getMonetizationNetwork(AFe1ySDK aFe1ySDK) {
            AFe1vSDK.component1 = aFe1ySDK;
        }
    }

    public AFe1vSDK(AFc1oSDK aFc1oSDK, AFc1qSDK aFc1qSDK) {
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        this.getRevenue = aFc1oSDK;
        this.getMediationNetwork = aFc1qSDK;
        this.component2 = ij.h.b(new AnonymousClass5());
        this.AFAdRevenueData = ij.h.b(new AnonymousClass1());
    }

    public final String AFAdRevenueData() {
        int i = AFa1uSDK.AFAdRevenueData[(getMediationNetwork() ? AFe1tSDK.DEFAULT : AFe1tSDK.API).ordinal()];
        if (i == 1) {
            return "appsflyersdk.com";
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new ij.j();
        }
        AFe1ySDK aFe1ySDK = component1;
        String str = aFe1ySDK != null ? aFe1ySDK.getCurrencyIso4217Code : null;
        return str == null ? "" : str;
    }

    public final String getCurrencyIso4217Code() {
        int i = AFa1uSDK.AFAdRevenueData[(getMediationNetwork() ? AFe1tSDK.DEFAULT : AFe1tSDK.API).ordinal()];
        if (i == 1) {
            return (String) this.AFAdRevenueData.getValue();
        }
        if (i != 2) {
            if (i == 3) {
                return "";
            }
            throw new ij.j();
        }
        AFe1ySDK aFe1ySDK = component1;
        String str = aFe1ySDK != null ? aFe1ySDK.getMonetizationNetwork : null;
        return str == null ? "" : str;
    }

    public static boolean getMediationNetwork() {
        return component1 == null;
    }

    public static final /* synthetic */ String getMediationNetwork(String str, String str2) throws NoSuchAlgorithmException {
        String str3 = str + str2;
        Intrinsics.checkNotNullParameter(str3, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String strEncodeToString = Base64.encodeToString(bArrDigest, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        String lowerCase = strEncodeToString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String strSubstring = new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring + ".";
    }

    public static final void getMonetizationNetwork(AFe1ySDK aFe1ySDK) {
        AFa1ySDK.getMonetizationNetwork(aFe1ySDK);
    }

    public static final /* synthetic */ String AFAdRevenueData(AFe1vSDK aFe1vSDK) {
        return (String) aFe1vSDK.component2.getValue();
    }
}
