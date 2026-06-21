package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j0.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pa.c0;
import qa.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new com.google.android.material.datepicker.a(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f2592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f2594h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f2595j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f2596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f2597l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashSet f2598m = new HashSet();

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, ArrayList arrayList, String str7, String str8) {
        this.f2588b = str;
        this.f2589c = str2;
        this.f2590d = str3;
        this.f2591e = str4;
        this.f2592f = uri;
        this.f2593g = str5;
        this.f2594h = j10;
        this.i = str6;
        this.f2595j = arrayList;
        this.f2596k = str7;
        this.f2597l = str8;
    }

    public static GoogleSignInAccount a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        c0.f(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j10, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f2593g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.i.equals(this.i)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f2595j);
        hashSet.addAll(googleSignInAccount.f2598m);
        HashSet hashSet2 = new HashSet(this.f2595j);
        hashSet2.addAll(this.f2598m);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.i.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f2595j);
        hashSet.addAll(this.f2598m);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = g.i0(parcel, 20293);
        g.b0(parcel, 2, this.f2588b);
        g.b0(parcel, 3, this.f2589c);
        g.b0(parcel, 4, this.f2590d);
        g.b0(parcel, 5, this.f2591e);
        g.a0(parcel, 6, this.f2592f, i);
        g.b0(parcel, 7, this.f2593g);
        g.h0(parcel, 8, 8);
        parcel.writeLong(this.f2594h);
        g.b0(parcel, 9, this.i);
        g.f0(parcel, 10, this.f2595j);
        g.b0(parcel, 11, this.f2596k);
        g.b0(parcel, 12, this.f2597l);
        g.m0(parcel, iI0);
    }
}
