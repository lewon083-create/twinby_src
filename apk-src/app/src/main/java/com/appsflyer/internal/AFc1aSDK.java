package com.appsflyer.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
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
public final class AFc1aSDK {
    public static final AFa1zSDK AFa1zSDK = new AFa1zSDK(null);
    final String AFAdRevenueData;
    public String getCurrencyIso4217Code;
    int getMediationNetwork;
    public String getRevenue;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AFa1zSDK {
        private AFa1zSDK() {
        }

        private static boolean AFAdRevenueData(Integer num, String... strArr) {
            boolean z5 = num == null;
            int length = strArr.length;
            for (int i = 0; i < 3; i++) {
                String str = strArr[i];
                z5 = z5 || str == null || str.length() == 0;
            }
            return z5;
        }

        public static AFc1aSDK getMediationNetwork(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            List<String> listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"\n"}, false, 0, 6, null);
            if (listSplit$default.size() == 4) {
                String revenue = null;
                String revenue2 = null;
                String revenue3 = null;
                Integer numValueOf = null;
                for (String str2 : listSplit$default) {
                    if (a0.n(str2, "label=", false)) {
                        revenue = getRevenue(str2, "label=");
                    } else if (a0.n(str2, "hashName=", false)) {
                        revenue2 = getRevenue(str2, "hashName=");
                    } else if (!a0.n(str2, "stackTrace=", false)) {
                        if (!a0.n(str2, "c=", false)) {
                            break;
                        }
                        String strSubstring = str2.substring(2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        numValueOf = Integer.valueOf(Integer.parseInt(StringsKt.P(strSubstring).toString()));
                    } else {
                        revenue3 = getRevenue(str2, "stackTrace=");
                    }
                }
                if (!AFAdRevenueData(numValueOf, revenue, revenue2, revenue3)) {
                    Intrinsics.b(revenue);
                    Intrinsics.b(revenue2);
                    Intrinsics.b(revenue3);
                    Intrinsics.b(numValueOf);
                    return new AFc1aSDK(revenue, revenue2, revenue3, numValueOf.intValue());
                }
            }
            return null;
        }

        private static String getRevenue(String str, String str2) {
            String strSubstring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String string = StringsKt.P(strSubstring).toString();
            Intrinsics.checkNotNullParameter(string, "");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = string.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] bArrDecode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
            return new String(bArrDecode, charset);
        }

        public /* synthetic */ AFa1zSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFc1aSDK(String str, String str2, String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.getCurrencyIso4217Code = str;
        this.AFAdRevenueData = str2;
        this.getRevenue = str3;
        this.getMediationNetwork = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1aSDK)) {
            return false;
        }
        AFc1aSDK aFc1aSDK = (AFc1aSDK) obj;
        return Intrinsics.a(this.getCurrencyIso4217Code, aFc1aSDK.getCurrencyIso4217Code) && Intrinsics.a(this.AFAdRevenueData, aFc1aSDK.AFAdRevenueData) && Intrinsics.a(this.getRevenue, aFc1aSDK.getRevenue) && this.getMediationNetwork == aFc1aSDK.getMediationNetwork;
    }

    public final String getMonetizationNetwork() {
        String str = this.getCurrencyIso4217Code;
        Intrinsics.checkNotNullParameter(str, "");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        String str2 = this.AFAdRevenueData;
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bytes2 = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        String strEncodeToString2 = Base64.encodeToString(bytes2, 2);
        String str3 = this.getRevenue;
        Intrinsics.checkNotNullParameter(str3, "");
        byte[] bytes3 = str3.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "");
        String strEncodeToString3 = Base64.encodeToString(bytes3, 2);
        int i = this.getMediationNetwork;
        StringBuilder sbJ = z.j("label=", strEncodeToString, "\nhashName=", strEncodeToString2, "\nstackTrace=");
        sbJ.append(strEncodeToString3);
        sbJ.append("\nc=");
        sbJ.append(i);
        return sbJ.toString();
    }

    public final JSONObject getRevenue() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.getCurrencyIso4217Code);
        jSONObject.put("hash_name", this.AFAdRevenueData);
        jSONObject.put("st", this.getRevenue);
        jSONObject.put("c", String.valueOf(this.getMediationNetwork));
        return jSONObject;
    }

    public final int hashCode() {
        return Integer.hashCode(this.getMediationNetwork) + ((this.getRevenue.hashCode() + ((this.AFAdRevenueData.hashCode() + (this.getCurrencyIso4217Code.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str = this.getCurrencyIso4217Code;
        String str2 = this.AFAdRevenueData;
        String str3 = this.getRevenue;
        int i = this.getMediationNetwork;
        StringBuilder sbJ = z.j("ExceptionInfo(label=", str, ", hashName=", str2, ", stackTrace=");
        sbJ.append(str3);
        sbJ.append(", counter=");
        sbJ.append(i);
        sbJ.append(")");
        return sbJ.toString();
    }

    public /* synthetic */ AFc1aSDK(String str, String str2, String str3, int i, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? 1 : i);
    }
}
