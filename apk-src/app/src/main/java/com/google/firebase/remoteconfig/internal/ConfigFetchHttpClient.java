package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import ge.f;
import ge.g;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ConfigFetchHttpClient {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f14909h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f14915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14916g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j10, long j11) {
        this.f14910a = context;
        this.f14911b = str;
        this.f14912c = str2;
        Matcher matcher = f14909h.matcher(str);
        this.f14913d = matcher.matches() ? matcher.group(1) : null;
        this.f14914e = "firebase";
        this.f14915f = j10;
        this.f14916g = j11;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i = bufferedReader.read();
            if (i == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) i);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l10, Map map2) throws f {
        HashMap map3 = new HashMap();
        if (str == null) {
            throw new f("Fetch failed: Firebase installation id is null.");
        }
        map3.put("appInstanceId", str);
        map3.put("appInstanceIdToken", str2);
        map3.put("appId", this.f14911b);
        Context context = this.f14910a;
        Locale locale = context.getResources().getConfiguration().locale;
        map3.put("countryCode", locale.getCountry());
        int i = Build.VERSION.SDK_INT;
        map3.put("languageCode", locale.toLanguageTag());
        map3.put("platformVersion", Integer.toString(i));
        map3.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map3.put("appVersion", packageInfo.versionName);
                map3.put("appBuild", Long.toString(i >= 28 ? c2.f.d(packageInfo) : packageInfo.versionCode));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map3.put("packageName", context.getPackageName());
        map3.put("sdkVersion", "23.0.1");
        map3.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            map3.put("customSignals", new JSONObject(map2));
            Log.d("FirebaseRemoteConfig", "Keys of custom signals during fetch: " + map2.keySet());
        }
        if (l10 != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map3.put("firstOpenTime", simpleDateFormat.format(l10));
        }
        return new JSONObject(map3);
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f14913d + "/namespaces/" + this.f14914e + ":fetch").openConnection();
        } catch (IOException e3) {
            throw new g(e3.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009d A[LOOP:0: B:13:0x0097->B:15:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d7 A[Catch: all -> 0x0189, JSONException -> 0x018b, IOException | JSONException -> 0x018d, TRY_LEAVE, TryCatch #1 {all -> 0x0189, blocks: (B:17:0x00bb, B:19:0x00d7, B:69:0x018f, B:70:0x0198, B:71:0x0199, B:72:0x01a0), top: B:84:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018f A[Catch: all -> 0x0189, JSONException -> 0x018b, IOException | JSONException -> 0x018d, TRY_ENTER, TryCatch #1 {all -> 0x0189, blocks: (B:17:0x00bb, B:19:0x00d7, B:69:0x018f, B:70:0x0198, B:71:0x0199, B:72:0x01a0), top: B:84:0x00bb }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public he.f fetch(java.net.HttpURLConnection r10, java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, java.lang.String r14, java.util.Map<java.lang.String, java.lang.String> r15, java.lang.Long r16, java.util.Date r17, java.util.Map<java.lang.String, java.lang.String> r18) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date, java.util.Map):he.f");
    }
}
