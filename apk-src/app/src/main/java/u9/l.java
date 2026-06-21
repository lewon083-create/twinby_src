package u9;

import android.content.Context;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.wk;
import com.google.android.gms.internal.ads.xt;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import q9.r;
import q9.s;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f34398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f34399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34400d;

    public l(Context context, String str) {
        this.f34398b = context;
        this.f34399c = str;
    }

    public final k a(String str, HashMap map) {
        k kVar = k.f34395d;
        k kVar2 = k.f34394c;
        if (str != null) {
            wk wkVar = al.f3009g;
            s sVar = s.f31967e;
            if (!((Boolean) sVar.f31970c.a(wkVar)).booleanValue() || !str.isEmpty()) {
                if (!((Boolean) sVar.f31970c.a(al.Q2)).booleanValue() || !r.f31959g.f31962c) {
                    try {
                        StringBuilder sb2 = new StringBuilder(str.length() + 13);
                        sb2.append("Pinging URL: ");
                        sb2.append(str);
                        i.c(sb2.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) c(str).openConnection();
                        try {
                            d dVar = r.f31959g.f31960a;
                            String str2 = this.f34399c;
                            httpURLConnection.setConnectTimeout(60000);
                            httpURLConnection.setInstanceFollowRedirects(true);
                            httpURLConnection.setReadTimeout(60000);
                            if (str2 != null) {
                                httpURLConnection.setRequestProperty("User-Agent", str2);
                            }
                            httpURLConnection.setUseCaches(false);
                            if (map != null) {
                                for (Map.Entry entry : map.entrySet()) {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                            f fVar = new f();
                            fVar.a(httpURLConnection, null);
                            int responseCode = httpURLConnection.getResponseCode();
                            fVar.b(httpURLConnection, responseCode);
                            if (responseCode < 200 || responseCode >= 300) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(responseCode).length() + 54 + str.length());
                                sb3.append("Received non-success response code ");
                                sb3.append(responseCode);
                                sb3.append(" from pinging URL: ");
                                sb3.append(str);
                                i.h(sb3.toString());
                                if (responseCode == 502) {
                                    kVar2 = kVar;
                                }
                            } else {
                                if (((Boolean) s.f31967e.f31970c.a(al.T8)).booleanValue()) {
                                    this.f34400d = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                                }
                                kVar2 = k.f34393b;
                            }
                            httpURLConnection.disconnect();
                            return kVar2;
                        } catch (Throwable th2) {
                            httpURLConnection.disconnect();
                            throw th2;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        String message = e.getMessage();
                        StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + str.length() + 27);
                        sb4.append("Error while pinging URL: ");
                        sb4.append(str);
                        sb4.append(". ");
                        sb4.append(message);
                        i.h(sb4.toString());
                        return kVar;
                    } catch (IndexOutOfBoundsException e7) {
                        e = e7;
                        kVar = kVar2;
                        d(str, e);
                        return kVar;
                    } catch (RuntimeException e10) {
                        e = e10;
                        String message2 = e.getMessage();
                        StringBuilder sb42 = new StringBuilder(String.valueOf(message2).length() + str.length() + 27);
                        sb42.append("Error while pinging URL: ");
                        sb42.append(str);
                        sb42.append(". ");
                        sb42.append(message2);
                        i.h(sb42.toString());
                        return kVar;
                    } catch (MalformedURLException e11) {
                        e = e11;
                        kVar = kVar2;
                        d(str, e);
                        return kVar;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
        return kVar2;
    }

    @Override // u9.c
    public final k b(String str) {
        return a(str, null);
    }

    public final URL c(String str) {
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (IllegalArgumentException e3) {
            e = e3;
            d(str, e);
        } catch (MalformedURLException e7) {
            e = e7;
            d(str, e);
        } catch (URISyntaxException e10) {
            d(str, e10);
            if (((Boolean) s.f31967e.f31970c.a(al.f2993f)).booleanValue()) {
                try {
                    i.c("Attempting to parse components, encode, and reconstruct URI.");
                    URL url2 = new URL(str);
                    URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
                    url = uri.toURL();
                    String string = uri.toString();
                    StringBuilder sb2 = new StringBuilder(str.length() + 114 + string.length());
                    sb2.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                    sb2.append(str);
                    sb2.append("\" -> encoded URI: ");
                    sb2.append(string);
                    i.c(sb2.toString());
                } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e11) {
                    d(str, e11);
                }
            }
        }
        if (url != null) {
            return url;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + 47);
        sb3.append("Falling back to direct new URL(\"");
        sb3.append(str);
        sb3.append("\") constructor.");
        i.c(sb3.toString());
        return new URL(str);
    }

    public final void d(String str, Exception exc) {
        String message = exc.getMessage();
        StringBuilder sb2 = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb2.append("Error while parsing ping URL: ");
        sb2.append(str);
        sb2.append(". ");
        sb2.append(message);
        i.h(sb2.toString());
        xt.a(this.f34398b).d(exc, "HttpUrlPinger.pingUrl", ((Integer) s.f31967e.f31970c.a(al.Wd)).intValue() / 100.0f);
    }
}
