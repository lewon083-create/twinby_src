package com.appsflyer.internal;

import a0.u;
import android.content.Context;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;

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
public final class AFc1vSDK implements AFc1tSDK {
    private final AFc1hSDK AFAdRevenueData;
    private final AFc1qSDK getMediationNetwork;
    private final Map<String, Integer> getMonetizationNetwork;
    private final AFc1rSDK getRevenue;

    public AFc1vSDK(AFc1hSDK aFc1hSDK, AFc1qSDK aFc1qSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        this.AFAdRevenueData = aFc1hSDK;
        this.getMediationNetwork = aFc1qSDK;
        this.getRevenue = new AFc1rSDK(s.f(new AFc1sSDK("ConversionsCache", r.c(AFe1pSDK.CONVERSION), 1), new AFc1sSDK("AttrCache", r.c(AFe1pSDK.ATTR), 1), new AFc1sSDK("OtherCache", s.f(AFe1pSDK.LAUNCH, AFe1pSDK.INAPP, AFe1pSDK.ADREVENUE, AFe1pSDK.ARS_VALIDATE, AFe1pSDK.PURCHASE_VALIDATE, AFe1pSDK.MANUAL_PURCHASE_VALIDATION, AFe1pSDK.SDK_SERVICES), 40)));
        this.getMonetizationNetwork = j0.h(new Pair("ConversionsCache", 0), new Pair("AttrCache", 0), new Pair("OtherCache", 0));
    }

    private static AFc1uSDK AFAdRevenueData(File file) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                char[] cArr = new char[(int) file.length()];
                inputStreamReader.read(cArr);
                AFc1uSDK aFc1uSDK = new AFc1uSDK(cArr);
                aFc1uSDK.getMediationNetwork = file.getName();
                inputStreamReader.close();
                return aFc1uSDK;
            } finally {
            }
        } catch (Exception e3) {
            AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Error while loading request from cache", e3, false, false, true, false);
            return null;
        }
    }

    private final void getMonetizationNetwork() {
        for (AFc1sSDK aFc1sSDK : this.getRevenue.getMediationNetwork) {
            String str = aFc1sSDK.AFAdRevenueData;
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.b(context);
            File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
            if (file.exists()) {
                Map<String, Integer> map = this.getMonetizationNetwork;
                String str2 = aFc1sSDK.AFAdRevenueData;
                File[] fileArrListFiles = file.listFiles();
                map.put(str2, Integer.valueOf(fileArrListFiles != null ? fileArrListFiles.length : 0));
            } else {
                file.mkdirs();
                this.getMonetizationNetwork.put(aFc1sSDK.AFAdRevenueData, 0);
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final List<AFc1uSDK> getCurrencyIso4217Code() {
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Get Cached Requests", false, 4, null);
        ArrayList arrayList = new ArrayList();
        ArrayList<File> arrayList2 = new ArrayList();
        try {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.b(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.b(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            }
            Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
            while (it.hasNext()) {
                String str = ((AFc1sSDK) it.next()).AFAdRevenueData;
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.b(context3);
                File file = new File(new File(context3.getFilesDir(), "AFRequestCache"), str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                x.n(arrayList2, fileArrListFiles);
            }
            for (File file2 : arrayList2) {
                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Found cached request: " + file2.getName(), false, 4, null);
                AFc1uSDK aFc1uSDKAFAdRevenueData = AFAdRevenueData(file2);
                if (aFc1uSDKAFAdRevenueData != null) {
                    arrayList.add(aFc1uSDKAFAdRevenueData);
                }
            }
        } catch (Exception e3) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not get cached requests", e3, false, false, false, false, 120, null);
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, u.k(arrayList.size(), "Found ", " Cached Requests"), false, 4, null);
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final void getMediationNetwork() {
        try {
            if (this.getMediationNetwork.getRevenue("AF_CACHE_VERSION", -1) == 2) {
                Context context = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.b(context);
                if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                    Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.b(context2);
                    new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                }
            } else {
                this.getMediationNetwork.getMediationNetwork("AF_CACHE_VERSION", 2);
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.b(context3);
                if (new File(context3.getFilesDir(), "AFRequestCache").exists()) {
                    Context context4 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.b(context4);
                    tj.m.f(new File(context4.getFilesDir(), "AFRequestCache"));
                    Context context5 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.b(context5);
                    new File(context5.getFilesDir(), "AFRequestCache").mkdir();
                }
            }
            getMonetizationNetwork();
        } catch (Exception e3) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not init cache", e3, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final void getRevenue() {
        try {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.b(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.b(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                return;
            }
            Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
            while (it.hasNext()) {
                String str = ((AFc1sSDK) it.next()).AFAdRevenueData;
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.b(context3);
                File[] fileArrListFiles = new File(new File(context3.getFilesDir(), "AFRequestCache"), str).listFiles();
                if (fileArrListFiles != null) {
                    Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                    for (File file : fileArrListFiles) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
                        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "ClearCache : Found cached request " + file.getName(), false, 4, null);
                        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Deleting " + file.getName() + " from cache", false, 4, null);
                        file.delete();
                    }
                }
            }
            Context context4 = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.b(context4);
            tj.m.f(new File(context4.getFilesDir(), "AFRequestCache"));
            getMonetizationNetwork();
        } catch (Exception e3) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not clearCache request", e3, false, false, false, false, 120, null);
        }
    }

    private final String AFAdRevenueData(AFe1pSDK aFe1pSDK) {
        String str;
        AFc1sSDK mediationNetwork = getMediationNetwork(aFe1pSDK);
        if (mediationNetwork == null || (str = mediationNetwork.AFAdRevenueData) == null) {
            throw new UnsupportedOperationException("Cache do not support this type of events");
        }
        return str;
    }

    private final boolean getMediationNetwork(File file) {
        try {
            file.delete();
            getMonetizationNetwork();
            return true;
        } catch (Exception e3) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, pe.a.f("Could not delete ", file.getName(), " from cache"), e3, false, false, false, false, 120, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final boolean getRevenue(String str) {
        if (str == null) {
            return false;
        }
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        Intrinsics.b(context);
        if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
            Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.b(context2);
            new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            return true;
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, pe.a.f("Deleting ", str, " from cache"), false, 4, null);
        Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
        while (it.hasNext()) {
            String str2 = ((AFc1sSDK) it.next()).AFAdRevenueData;
            Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.b(context3);
            File file = new File(new File(new File(context3.getFilesDir(), "AFRequestCache"), str2), str);
            if (file.exists()) {
                return getMediationNetwork(file);
            }
        }
        return true;
    }

    private final AFc1sSDK getMediationNetwork(AFe1pSDK aFe1pSDK) {
        Object next;
        Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AFc1sSDK) next).getMediationNetwork.contains(aFe1pSDK)) {
                break;
            }
        }
        return (AFc1sSDK) next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012d A[Catch: Exception -> 0x0134, TryCatch #5 {Exception -> 0x0134, blocks: (B:25:0x011f, B:27:0x012d, B:32:0x013d, B:34:0x0149, B:36:0x014d, B:38:0x0155, B:41:0x015d, B:43:0x019e, B:44:0x01a1, B:46:0x01a7, B:52:0x01d4, B:54:0x01da, B:56:0x01e2, B:57:0x01e8, B:59:0x01ee, B:49:0x01bc, B:51:0x01d1, B:60:0x021c, B:62:0x0220, B:63:0x0227, B:72:0x0232, B:73:0x0235, B:70:0x0230), top: B:88:0x007a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013d A[Catch: Exception -> 0x0134, TryCatch #5 {Exception -> 0x0134, blocks: (B:25:0x011f, B:27:0x012d, B:32:0x013d, B:34:0x0149, B:36:0x014d, B:38:0x0155, B:41:0x015d, B:43:0x019e, B:44:0x01a1, B:46:0x01a7, B:52:0x01d4, B:54:0x01da, B:56:0x01e2, B:57:0x01e8, B:59:0x01ee, B:49:0x01bc, B:51:0x01d1, B:60:0x021c, B:62:0x0220, B:63:0x0227, B:72:0x0232, B:73:0x0235, B:70:0x0230), top: B:88:0x007a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0228 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFc1tSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getMediationNetwork(com.appsflyer.internal.AFc1uSDK r20) {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1vSDK.getMediationNetwork(com.appsflyer.internal.AFc1uSDK):java.lang.String");
    }
}
