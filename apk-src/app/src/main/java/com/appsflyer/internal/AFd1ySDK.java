package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1aSDK;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b0;
import kotlin.collections.o0;
import kotlin.collections.p;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFd1ySDK implements AFc1cSDK {
    private final AFc1hSDK getMonetizationNetwork;

    public AFd1ySDK(AFc1hSDK aFc1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        this.getMonetizationNetwork = aFc1hSDK;
    }

    private final File AFAdRevenueData() {
        Context context = this.getMonetizationNetwork.getMonetizationNetwork;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final boolean getCurrencyIso4217Code() {
        return getMonetizationNetwork(new String[0]);
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final int getMediationNetwork() {
        Iterator<T> it = getRevenue().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((AFc1aSDK) it.next()).getMediationNetwork;
        }
        return i;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final boolean getMonetizationNetwork(String... strArr) {
        boolean zF;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            try {
                File fileAFAdRevenueData = AFAdRevenueData();
                zF = true;
                if (fileAFAdRevenueData != null) {
                    if (strArr.length == 0) {
                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        zF = tj.m.f(fileAFAdRevenueData);
                    } else {
                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions except for: " + p.r(strArr, ", ", null, 62), false, 4, null);
                        File[] fileArrListFiles = fileAFAdRevenueData.listFiles();
                        if (fileArrListFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                            ArrayList<File> arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                if (!p.k(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(t.j(arrayList, 10));
                            for (File file2 : arrayList) {
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                arrayList2.add(Boolean.valueOf(tj.m.f(file2)));
                            }
                            Set setV = CollectionsKt.V(arrayList2);
                            if (setV.isEmpty()) {
                                setV = o0.b(Boolean.TRUE);
                            }
                            Set set = setV;
                            if (set.size() != 1 || !((Boolean) CollectionsKt.C(set)).booleanValue()) {
                                zF = false;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zF;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final List<AFc1aSDK> getRevenue() {
        List<AFc1aSDK> listK;
        File[] fileArrListFiles;
        ArrayList arrayList;
        File[] fileArrListFiles2;
        synchronized (this) {
            try {
                File fileAFAdRevenueData = AFAdRevenueData();
                listK = null;
                if (fileAFAdRevenueData != null && (fileArrListFiles = fileAFAdRevenueData.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : fileArrListFiles) {
                        try {
                            fileArrListFiles2 = file.listFiles();
                        } catch (Throwable th2) {
                            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th2.getMessage(), false, 4, null);
                        }
                        if (fileArrListFiles2 != null) {
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles2, "");
                            arrayList = new ArrayList();
                            for (File file2 : fileArrListFiles2) {
                                AFc1aSDK.AFa1zSDK aFa1zSDK = AFc1aSDK.AFa1zSDK;
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                AFc1aSDK mediationNetwork = AFc1aSDK.AFa1zSDK.getMediationNetwork(tj.k.b(file2));
                                if (mediationNetwork != null) {
                                    arrayList.add(mediationNetwork);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            arrayList2.add(arrayList);
                        }
                    }
                    listK = t.k(arrayList2);
                }
                if (listK == null) {
                    listK = b0.f27475b;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return listK;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final void getCurrencyIso4217Code(int i, int i10) {
        File[] fileArrListFiles;
        synchronized (this) {
            try {
                File fileAFAdRevenueData = AFAdRevenueData();
                if (fileAFAdRevenueData != null && (fileArrListFiles = fileAFAdRevenueData.listFiles()) != null) {
                    Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : fileArrListFiles) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        int mediationNetwork = AFk1xSDK.getMediationNetwork(name);
                        if (i > mediationNetwork || mediationNetwork > i10) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(t.j(arrayList, 10));
                    for (File file2 : arrayList) {
                        Intrinsics.checkNotNullExpressionValue(file2, "");
                        arrayList2.add(Boolean.valueOf(tj.m.f(file2)));
                    }
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final String AFAdRevenueData(Throwable th2, String str) {
        String str2;
        File file;
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File fileAFAdRevenueData = AFAdRevenueData();
            str2 = null;
            if (fileAFAdRevenueData != null) {
                file = new File(fileAFAdRevenueData, "6.17.6");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    AFc1aSDK revenue = AFd1sSDK.getRevenue(th2, str);
                    String str3 = revenue.AFAdRevenueData;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        AFc1aSDK.AFa1zSDK aFa1zSDK = AFc1aSDK.AFa1zSDK;
                        AFc1aSDK mediationNetwork = AFc1aSDK.AFa1zSDK.getMediationNetwork(tj.k.b(file2));
                        if (mediationNetwork != null) {
                            mediationNetwork.getMediationNetwork++;
                            revenue = mediationNetwork;
                        }
                    }
                    tj.k.c(file2, revenue.getMonetizationNetwork());
                    str2 = str3;
                } catch (Exception e3) {
                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e3.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }
}
