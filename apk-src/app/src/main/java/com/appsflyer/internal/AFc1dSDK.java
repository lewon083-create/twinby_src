package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import ek.o;
import ek.p;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public abstract class AFc1dSDK {
    public int AFAdRevenueData;
    private final boolean getCurrencyIso4217Code;
    public Map<String, String> getMonetizationNetwork;
    public byte[] getRevenue;

    public AFc1dSDK(byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getRevenue = bArr;
        this.getMonetizationNetwork = map;
        this.AFAdRevenueData = i;
        this.getCurrencyIso4217Code = true;
    }

    private static String getMonetizationNetwork(HttpURLConnection httpURLConnection) throws IOException {
        InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
            String message = th2.getMessage();
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, message == null ? "" : message, th2, false, false, false, false, 96, null);
            errorStream = httpURLConnection.getErrorStream();
        }
        if (errorStream == null) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(errorStream, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        ArrayList arrayList = new ArrayList();
        o action = new o(5, arrayList);
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
            p pVar = new p(bufferedReader);
            Intrinsics.checkNotNullParameter(pVar, "<this>");
            Iterator it = new ek.a(pVar).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.f27471a;
            bufferedReader.close();
            String strI = CollectionsKt.I(arrayList, null, null, null, null, 63);
            bufferedReader.close();
            return strI == null ? "" : strI;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                hl.l.g(bufferedReader, th3);
                throw th4;
            }
        }
    }

    public abstract String AFAdRevenueData(String str);

    public final boolean AFAdRevenueData() {
        HttpURLConnection httpURLConnection;
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection2 = null;
        try {
            String currencyIso4217Code = getCurrencyIso4217Code();
            Intrinsics.checkNotNullParameter(currencyIso4217Code, "");
            URLConnection uRLConnectionOpenConnection = new URL(currencyIso4217Code).openConnection();
            Intrinsics.c(uRLConnectionOpenConnection, "");
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            boolean revenue = getRevenue(httpURLConnection, jCurrentTimeMillis);
            httpURLConnection.disconnect();
            return revenue;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = httpURLConnection;
            try {
                String str = "error: " + th + "\n\ttook " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms\n\t" + th.getMessage();
                String strAFAdRevenueData = AFAdRevenueData("HTTP: [" + (httpURLConnection2 != null ? httpURLConnection2.hashCode() : 0) + "] " + str);
                if (getRevenue()) {
                    AFLogger.afRDLog(strAFAdRevenueData);
                } else {
                    AFLogger.afVerboseLog(strAFAdRevenueData);
                }
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return false;
            } catch (Throwable th4) {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th4;
            }
        }
    }

    public abstract String getCurrencyIso4217Code();

    public abstract AFd1jSDK getMediationNetwork();

    public boolean getRevenue() {
        return this.getCurrencyIso4217Code;
    }

    private final boolean getRevenue(HttpURLConnection httpURLConnection, long j10) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb2 = new StringBuilder(httpURLConnection.getRequestMethod() + StringUtils.PROCESS_POSTFIX_DELIMITER + httpURLConnection.getURL());
        sb2.append("\n length: ");
        sb2.append(new String(this.getRevenue, Charsets.UTF_8).length());
        Map<String, String> map = this.getMonetizationNetwork;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
        }
        String strAFAdRevenueData = AFAdRevenueData("HTTP: [" + httpURLConnection.hashCode() + "] " + ((Object) sb2));
        if (getRevenue()) {
            AFLogger.afRDLog(strAFAdRevenueData);
        } else {
            AFLogger.afVerboseLog(strAFAdRevenueData);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.AFAdRevenueData);
        httpURLConnection.setConnectTimeout(this.AFAdRevenueData);
        httpURLConnection.addRequestProperty("Content-Type", getMediationNetwork().getCurrencyIso4217Code);
        Map<String, String> map2 = this.getMonetizationNetwork;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.getRevenue.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.getRevenue);
        bufferedOutputStream.close();
        String monetizationNetwork = getMonetizationNetwork(httpURLConnection);
        long jCurrentTimeMillis = System.currentTimeMillis() - j10;
        StringBuilder sbI = pe.a.i(httpURLConnection.getResponseCode(), "response code:", " ", httpURLConnection.getResponseMessage(), "\n\tbody:");
        sbI.append(monetizationNetwork);
        sbI.append("\n\ttook ");
        sbI.append(jCurrentTimeMillis);
        sbI.append("ms");
        String string = sbI.toString();
        String strAFAdRevenueData2 = AFAdRevenueData("HTTP: [" + httpURLConnection.hashCode() + "] " + string);
        if (getRevenue()) {
            AFLogger.afRDLog(strAFAdRevenueData2);
        } else {
            AFLogger.afVerboseLog(strAFAdRevenueData2);
        }
        return AFd1qSDK.getCurrencyIso4217Code(httpURLConnection);
    }
}
