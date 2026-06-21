package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f13061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f13062h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fa1 f13063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f13064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f13065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f13066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f13067n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final JSONObject f13068o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final JSONObject f13069p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f13070q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f13071r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f13072s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f13073t;

    public zp0(JsonReader jsonReader) throws IOException {
        String str;
        List listP = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String str2 = "";
        int iNextInt = 0;
        String strNextString = "";
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        boolean zNextBoolean = false;
        fa1 fa1Var = null;
        long j10 = -1;
        long j11 = -1;
        long jNextLong = 0;
        int iNextInt2 = -1;
        int iMax = 1;
        int iNextInt3 = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Objects.equals(strNextName, "nofill_urls")) {
                listP = com.google.android.gms.internal.measurement.b4.P(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if (Objects.equals(strNextName, "refresh_load_delay_time_interval")) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString2 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt3 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                wk wkVar = al.f3198s9;
                str = str2;
                q9.s sVar = q9.s.f31967e;
                long j12 = j10;
                yk ykVar = sVar.f31970c;
                yk ykVar2 = sVar.f31970c;
                if (((Boolean) ykVar.a(wkVar)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    fa1 fa1Var2 = new fa1();
                    jsonReader.beginObject();
                    String strNextString8 = str;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        int iHashCode = strNextName2.hashCode();
                        if (iHashCode != -1724546052) {
                            if (iHashCode == 3059181 && strNextName2.equals("code")) {
                                jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName2.equals("description")) {
                            strNextString8 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    fa1Var2.f5304b = strNextString8;
                    fa1Var = fa1Var2;
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString3 = jsonReader.nextString();
                } else {
                    if (((Boolean) ykVar2.a(al.Fb)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(strNextName)) {
                        strNextString7 = jsonReader.nextString();
                    } else {
                        if ("response_info_extras".equals(strNextName)) {
                            if (((Boolean) ykVar2.a(al.f3300z7)).booleanValue()) {
                                try {
                                    Bundle bundleV = com.google.android.gms.internal.measurement.b4.V(com.google.android.gms.internal.measurement.b4.Q(jsonReader));
                                    if (bundleV != null) {
                                        bundle = bundleV;
                                    }
                                } catch (IOException | JSONException unused) {
                                    j10 = j12;
                                } catch (IllegalStateException unused2) {
                                    jsonReader.skipValue();
                                    j10 = j12;
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if ("adRequestPostBody".equals(strNextName)) {
                            if (((Boolean) ykVar2.a(al.f3288ya)).booleanValue()) {
                                strNextString5 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (!"adRequestUrl".equals(strNextName)) {
                            wk wkVar2 = al.za;
                            if (((Boolean) ykVar2.a(wkVar2)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                                strNextString6 = jsonReader.nextString();
                            } else if (((Boolean) ykVar2.a(wkVar2)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                                jSONObject = com.google.android.gms.internal.measurement.b4.Q(jsonReader);
                            } else {
                                if (Objects.equals(strNextName, "max_parallel_renderers")) {
                                    iMax = Math.max(1, jsonReader.nextInt());
                                } else if (((Boolean) ykVar2.a(al.Ha)).booleanValue() && Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                    jSONObject2 = com.google.android.gms.internal.measurement.b4.Q(jsonReader);
                                } else if (((Boolean) ykVar2.a(al.C2)).booleanValue() && Objects.equals(strNextName, "latency_extras")) {
                                    try {
                                        Bundle bundleV2 = com.google.android.gms.internal.measurement.b4.V(com.google.android.gms.internal.measurement.b4.Q(jsonReader));
                                        if (bundleV2 != null) {
                                            double d10 = bundleV2.getDouble("start_time");
                                            j11 = (d10 > 9.223372036854776E18d || d10 < -9.223372036854776E18d) ? -1L : (long) d10;
                                            double d11 = bundleV2.getDouble("end_time");
                                            j10 = (d11 > 9.223372036854776E18d || d11 < -9.223372036854776E18d) ? -1L : (long) d11;
                                        }
                                    } catch (IOException | JSONException unused3) {
                                    } catch (IllegalStateException unused4) {
                                        jsonReader.skipValue();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                                j10 = j12;
                            }
                        } else if (((Boolean) ykVar2.a(al.f3288ya)).booleanValue()) {
                            strNextString4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                        str2 = str;
                    }
                    j10 = j12;
                    str2 = str;
                }
                j10 = j12;
                str2 = str;
            }
            str = str2;
            str2 = str;
        }
        long j13 = j10;
        jsonReader.endObject();
        this.f13055a = listP;
        this.f13057c = iNextInt;
        if (((Boolean) hm.f6181d.r()).booleanValue()) {
            this.f13058d = -1;
        } else {
            ya yaVar = rl.f9957a;
            if (((Long) yaVar.r()).longValue() > -1) {
                this.f13058d = ((Long) yaVar.r()).intValue();
            } else {
                this.f13058d = iNextInt2;
            }
        }
        this.f13056b = strNextString;
        this.f13059e = strNextString2;
        this.f13060f = iNextInt3;
        this.f13061g = jNextLong;
        this.f13063j = fa1Var;
        this.f13062h = zNextBoolean;
        this.i = strNextString3;
        this.f13064k = bundle;
        this.f13065l = strNextString4;
        this.f13066m = strNextString5;
        this.f13067n = strNextString6;
        this.f13068o = jSONObject;
        this.f13069p = jSONObject2;
        this.f13070q = strNextString7;
        ya yaVar2 = fm.f5386a;
        this.f13071r = ((Long) yaVar2.r()).longValue() > 0 ? ((Long) yaVar2.r()).intValue() : iMax;
        this.f13072s = j11;
        this.f13073t = j13;
    }
}
