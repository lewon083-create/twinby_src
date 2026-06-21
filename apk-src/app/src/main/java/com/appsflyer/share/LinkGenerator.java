package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFa1ySDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1gSDK;
import com.appsflyer.internal.AFe1oSDK;
import com.appsflyer.internal.AFe1oSDK.AnonymousClass1;
import com.appsflyer.internal.AFj1fSDK;
import com.appsflyer.internal.AFk1uSDK;
import gf.a;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class LinkGenerator {
    String AFAdRevenueData;
    private String areAllFieldsValid;
    private String component1;
    private String component2;
    private String component3;
    private String component4;
    private final Map<String, String> copy = new HashMap();
    private String copydefault;
    private String getCurrencyIso4217Code;
    private final String getMediationNetwork;
    String getMonetizationNetwork;
    private String getRevenue;
    private String toString;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.getMediationNetwork = str;
    }

    private Map<String, String> getCurrencyIso4217Code() {
        HashMap map = new HashMap();
        map.put("pid", this.getMediationNetwork);
        String str = this.areAllFieldsValid;
        if (str != null) {
            map.put("af_referrer_uid", str);
        }
        String str2 = this.getCurrencyIso4217Code;
        if (str2 != null) {
            map.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.component3;
        if (str3 != null) {
            map.put("af_referrer_customer_id", str3);
        }
        String str4 = this.getRevenue;
        if (str4 != null) {
            map.put("c", str4);
        }
        String str5 = this.component4;
        if (str5 != null) {
            map.put("af_referrer_name", str5);
        }
        String str6 = this.component2;
        if (str6 != null) {
            map.put("af_referrer_image_url", str6);
        }
        if (this.toString != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.toString);
            String str7 = this.component1;
            if (str7 != null) {
                this.component1 = str7.replaceFirst("^[/]", "");
                sb2.append(this.toString.endsWith("/") ? "" : "/");
                sb2.append(this.component1);
            }
            map.put("af_dp", sb2.toString());
        }
        for (Map.Entry<String, String> entry : this.copy.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return AFj1fSDK.getRevenue(map);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.copy.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.copy.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.AFAdRevenueData;
        if (str == null || !str.startsWith("http")) {
            sb2.append(String.format(AFk1uSDK.getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getRevenue().getHostName()));
        } else {
            sb2.append(this.AFAdRevenueData);
        }
        if (this.getMonetizationNetwork != null) {
            sb2.append('/');
            sb2.append(this.getMonetizationNetwork);
        }
        Map<String, String> currencyIso4217Code = getCurrencyIso4217Code();
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry<String, String> entry : currencyIso4217Code.entrySet()) {
            if (sb3.length() == 0) {
                sb3.append('?');
            } else {
                sb3.append('&');
            }
            sb3.append(entry.getKey());
            sb3.append('=');
            sb3.append(entry.getValue());
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public String getBrandDomain() {
        return this.copydefault;
    }

    public String getCampaign() {
        return this.getRevenue;
    }

    public String getChannel() {
        return this.getCurrencyIso4217Code;
    }

    public String getMediaSource() {
        return this.getMediationNetwork;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.copy);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.toString = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.AFAdRevenueData = z.e("https://", a.k(AppsFlyerLib.getInstance().getHostPrefix(), "app.", AFa1ySDK.getRevenue().getHostName()), "/", str3);
            return this;
        }
        if (str2 == null || str2.length() < 5) {
            str2 = "go.onelink.me";
        }
        this.AFAdRevenueData = z.e("https://", str2, "/", str);
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.copydefault = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.getRevenue = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.getCurrencyIso4217Code = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.component1 = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.component3 = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.component2 = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.component4 = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.areAllFieldsValid = str;
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.copydefault;
        Map<String, String> currencyIso4217Code = getCurrencyIso4217Code();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFa1ySDK.getRevenue().AFAdRevenueData(context);
        AFd1zSDK monetizationNetwork = AFa1ySDK.getRevenue().getMonetizationNetwork();
        AFe1gSDK aFe1gSDK = new AFe1gSDK(monetizationNetwork, UUID.randomUUID(), string, currencyIso4217Code, str, responseListener, this);
        AFe1oSDK aFe1oSDKCopydefault = monetizationNetwork.copydefault();
        aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new AnonymousClass1(aFe1gSDK));
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.1
            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponse(String str) {
                responseListener.onResponse(str);
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponseError(String str) {
                responseListener.onResponseError(str);
            }
        });
    }
}
