package ha;

import ac.h;
import ad.m0;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import c7.k;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.internal.auth.a2;
import com.google.android.gms.internal.auth.c2;
import com.google.android.gms.internal.auth.d2;
import com.google.android.gms.internal.auth.e2;
import com.google.android.gms.internal.auth.f2;
import com.google.android.gms.internal.auth.p;
import com.google.android.gms.internal.auth.w0;
import com.google.android.gms.internal.auth.z1;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.play_billing.w;
import com.google.firebase.messaging.y;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import ma.f;
import ma.g;
import ma.i;
import ma.j;
import na.e;
import pa.c0;
import pa.p0;
import sb.m;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f20467a = {"com.google", "com.google.work", "cn.google"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ComponentName f20468b = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0 f20469c = new m0("Auth", new String[]{"GoogleAuthUtil"});

    public static void a(Context context, String str) throws IOException, k {
        Context context2;
        c0.h("Calling this from your main thread can lead to deadlock");
        f(context);
        Bundle bundle = new Bundle();
        g(context, bundle);
        p.c(context);
        ((f2) ((e2) d2.f13192c.f13193b.h())).getClass();
        if (((Boolean) f2.f13209b.b()).booleanValue() && i(context)) {
            context2 = context;
            com.google.android.gms.internal.auth.a aVar = new com.google.android.gms.internal.auth.a(context2, null, com.google.android.gms.internal.auth.a.f13167m, na.b.V1, e.f29187c);
            com.google.android.gms.internal.auth.b bVar = new com.google.android.gms.internal.auth.b();
            bVar.f13173c = str;
            h hVarA = w.a();
            hVarA.f754e = new ma.d[]{c.f20472c};
            hVarA.f753d = new w0(aVar, bVar);
            hVarA.f752c = 1513;
            try {
                e(aVar.e(1, hVarA.a()), "clear token");
                return;
            } catch (na.d e3) {
                f20469c.t("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", "clear token", Log.getStackTraceString(e3));
            }
        } else {
            context2 = context;
        }
        d(context2, f20468b, new h3.e(1, str, bundle));
    }

    public static String b(Context context, Account account, String str) throws IOException, k {
        Context context2;
        TokenData tokenDataC;
        Bundle bundle;
        m0 m0Var = f20469c;
        Bundle bundle2 = new Bundle();
        h(account);
        c0.h("Calling this from your main thread can lead to deadlock");
        c0.g(str, "Scope cannot be empty or null.");
        h(account);
        f(context);
        Bundle bundle3 = new Bundle(bundle2);
        g(context, bundle3);
        p.c(context);
        ((f2) ((e2) d2.f13192c.f13193b.h())).getClass();
        if (((Boolean) f2.f13209b.b()).booleanValue() && i(context)) {
            context2 = context;
            com.google.android.gms.internal.auth.a aVar = new com.google.android.gms.internal.auth.a(context2, null, com.google.android.gms.internal.auth.a.f13167m, na.b.V1, e.f29187c);
            c0.g(str, "Scope cannot be null!");
            h hVarA = w.a();
            hVarA.f754e = new ma.d[]{c.f20472c};
            hVarA.f753d = new ka.k(aVar, account, str, bundle3);
            hVarA.f752c = 1512;
            try {
                bundle = (Bundle) e(aVar.e(1, hVarA.a()), "token retrieval");
            } catch (na.d e3) {
                m0Var.t("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", "token retrieval", Log.getStackTraceString(e3));
                y yVar = new y();
                yVar.f14900c = account;
                yVar.f14899b = str;
                yVar.f14901d = bundle3;
                yVar.f14902e = context2;
                tokenDataC = (TokenData) d(context2, f20468b, yVar);
            }
            if (bundle != null) {
                tokenDataC = c(context2, bundle);
                return tokenDataC.f2580c;
            }
            m0Var.t("Service call returned null.", new Object[0]);
            throw new IOException("Service unavailable.");
        }
        context2 = context;
        y yVar2 = new y();
        yVar2.f14900c = account;
        yVar2.f14899b = str;
        yVar2.f14901d = bundle3;
        yVar2.f14902e = context2;
        tokenDataC = (TokenData) d(context2, f20468b, yVar2);
        return tokenDataC.f2580c;
    }

    public static TokenData c(Context context, Bundle bundle) throws IOException, k {
        TokenData tokenData;
        String str;
        int i;
        String str2;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent");
        int[] iArrP = z.p(61);
        int length = iArrP.length;
        int i10 = 0;
        while (true) {
            str = "BAD_REQUEST";
            if (i10 < length) {
                i = iArrP[i10];
                switch (i) {
                    case 1:
                        str2 = "ClientLoginDisabled";
                        break;
                    case 2:
                        str2 = "SocketTimeout";
                        break;
                    case 3:
                        str2 = "Ok";
                        break;
                    case 4:
                        str2 = "UNKNOWN_ERR";
                        break;
                    case 5:
                        str2 = "NetworkError";
                        break;
                    case 6:
                        str2 = "ServiceUnavailable";
                        break;
                    case 7:
                        str2 = "InternalError";
                        break;
                    case 8:
                        str2 = "IllegalArgument";
                        break;
                    case 9:
                        str2 = "BadAuthentication";
                        break;
                    case 10:
                        str2 = "BAD_REQUEST";
                        break;
                    case 11:
                        str2 = "EmptyConsumerPackageOrSig";
                        break;
                    case 12:
                        str2 = "InvalidSecondFactor";
                        break;
                    case 13:
                        str2 = "PostSignInFlowRequired";
                        break;
                    case 14:
                        str2 = "NeedsBrowser";
                        break;
                    case 15:
                        str2 = "Unknown";
                        break;
                    case 16:
                        str2 = "NotVerified";
                        break;
                    case 17:
                        str2 = "TermsNotAgreed";
                        break;
                    case 18:
                        str2 = "AccountDisabled";
                        break;
                    case 19:
                        str2 = "CaptchaRequired";
                        break;
                    case 20:
                        str2 = "AccountDeleted";
                        break;
                    case 21:
                        str2 = "ServiceDisabled";
                        break;
                    case 22:
                        str2 = "ChallengeRequired";
                        break;
                    case 23:
                        str2 = "NeedPermission";
                        break;
                    case 24:
                        str2 = "NeedRemoteConsent";
                        break;
                    case 25:
                        str2 = "INVALID_SCOPE";
                        break;
                    case 26:
                        str2 = "UserCancel";
                        break;
                    case 27:
                        str2 = "PermissionDenied";
                        break;
                    case 28:
                        str2 = "RESTRICTED_CLIENT";
                        break;
                    case 29:
                        str2 = "INVALID_AUDIENCE";
                        break;
                    case 30:
                        str2 = "UNREGISTERED_ON_API_CONSOLE";
                        break;
                    case 31:
                        str2 = "ThirdPartyDeviceManagementRequired";
                        break;
                    case 32:
                        str2 = "DeviceManagementInternalError";
                        break;
                    case 33:
                        str2 = "DeviceManagementSyncDisabled";
                        break;
                    case 34:
                        str2 = "DeviceManagementAdminBlocked";
                        break;
                    case 35:
                        str2 = "DeviceManagementAdminPendingApproval";
                        break;
                    case 36:
                        str2 = "DeviceManagementStaleSyncRequired";
                        break;
                    case 37:
                        str2 = "DeviceManagementDeactivated";
                        break;
                    case 38:
                        str2 = "DeviceManagementScreenlockRequired";
                        break;
                    case 39:
                        str2 = "DeviceManagementRequired";
                        break;
                    case 40:
                        str2 = "DeviceManagementRequiredOrSyncDisabled";
                        break;
                    case 41:
                        str2 = "ALREADY_HAS_GMAIL";
                        break;
                    case 42:
                        str2 = "WeakPassword";
                        break;
                    case 43:
                        str2 = "BadRequest";
                        break;
                    case 44:
                        str2 = "BadUsername";
                        break;
                    case 45:
                        str2 = "DeletedGmail";
                        break;
                    case 46:
                        str2 = "ExistingUsername";
                        break;
                    case 47:
                        str2 = "LoginFail";
                        break;
                    case 48:
                        str2 = "NotLoggedIn";
                        break;
                    case 49:
                        str2 = "NoGmail";
                        break;
                    case 50:
                        str2 = "RequestDenied";
                        break;
                    case 51:
                        str2 = "ServerError";
                        break;
                    case 52:
                        str2 = "UsernameUnavailable";
                        break;
                    case 53:
                        str2 = "GPlusOther";
                        break;
                    case 54:
                        str2 = "GPlusNickname";
                        break;
                    case 55:
                        str2 = "GPlusInvalidChar";
                        break;
                    case 56:
                        str2 = "GPlusInterstitial";
                        break;
                    case 57:
                        str2 = "ProfileUpgradeError";
                        break;
                    case 58:
                        str2 = "AuthSecurityError";
                        break;
                    case 59:
                        str2 = "AuthBindingError";
                        break;
                    case 60:
                        str2 = "AccountNotPresent";
                        break;
                    case 61:
                        str2 = "AppSuspended";
                        break;
                    default:
                        throw null;
                }
                if (!str2.equals(string)) {
                    i10++;
                }
            } else {
                i = 15;
            }
        }
        StringBuilder sb2 = new StringBuilder("[GoogleAuthUtil] error status:");
        switch (i) {
            case 1:
                str = "CLIENT_LOGIN_DISABLED";
                break;
            case 2:
                str = "SOCKET_TIMEOUT";
                break;
            case 3:
                str = "SUCCESS";
                break;
            case 4:
                str = "UNKNOWN_ERROR";
                break;
            case 5:
                str = "NETWORK_ERROR";
                break;
            case 6:
                str = "SERVICE_UNAVAILABLE";
                break;
            case 7:
                str = "INTNERNAL_ERROR";
                break;
            case 8:
                str = "ILLEGAL_ARGUMENT";
                break;
            case 9:
                str = "BAD_AUTHENTICATION";
                break;
            case 10:
                str = "BAD_TOKEN_REQUEST";
                break;
            case 11:
                str = "EMPTY_CONSUMER_PKG_OR_SIG";
                break;
            case 12:
                str = "NEEDS_2F";
                break;
            case 13:
                str = "NEEDS_POST_SIGN_IN_FLOW";
                break;
            case 14:
                str = "NEEDS_BROWSER";
                break;
            case 15:
                str = "UNKNOWN";
                break;
            case 16:
                str = "NOT_VERIFIED";
                break;
            case 17:
                str = "TERMS_NOT_AGREED";
                break;
            case 18:
                str = "ACCOUNT_DISABLED";
                break;
            case 19:
                str = "CAPTCHA";
                break;
            case 20:
                str = "ACCOUNT_DELETED";
                break;
            case 21:
                str = "SERVICE_DISABLED";
                break;
            case 22:
                str = "CHALLENGE_REQUIRED";
                break;
            case 23:
                str = "NEED_PERMISSION";
                break;
            case 24:
                str = "NEED_REMOTE_CONSENT";
                break;
            case 25:
                str = "INVALID_SCOPE";
                break;
            case 26:
                str = "USER_CANCEL";
                break;
            case 27:
                str = "PERMISSION_DENIED";
                break;
            case 28:
                str = "RESTRICTED_CLIENT";
                break;
            case 29:
                str = "INVALID_AUDIENCE";
                break;
            case 30:
                str = "UNREGISTERED_ON_API_CONSOLE";
                break;
            case 31:
                str = "THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED";
                break;
            case 32:
                str = "DM_INTERNAL_ERROR";
                break;
            case 33:
                str = "DM_SYNC_DISABLED";
                break;
            case 34:
                str = "DM_ADMIN_BLOCKED";
                break;
            case 35:
                str = "DM_ADMIN_PENDING_APPROVAL";
                break;
            case 36:
                str = "DM_STALE_SYNC_REQUIRED";
                break;
            case 37:
                str = "DM_DEACTIVATED";
                break;
            case 38:
                str = "DM_SCREENLOCK_REQUIRED";
                break;
            case 39:
                str = "DM_REQUIRED";
                break;
            case 40:
                str = "DEVICE_MANAGEMENT_REQUIRED";
                break;
            case 41:
                str = "ALREADY_HAS_GMAIL";
                break;
            case 42:
                str = "BAD_PASSWORD";
                break;
            case 43:
                break;
            case 44:
                str = "BAD_USERNAME";
                break;
            case 45:
                str = "DELETED_GMAIL";
                break;
            case 46:
                str = "EXISTING_USERNAME";
                break;
            case 47:
                str = "LOGIN_FAIL";
                break;
            case 48:
                str = "NOT_LOGGED_IN";
                break;
            case 49:
                str = "NO_GMAIL";
                break;
            case 50:
                str = "REQUEST_DENIED";
                break;
            case 51:
                str = "SERVER_ERROR";
                break;
            case 52:
                str = "USERNAME_UNAVAILABLE";
                break;
            case 53:
                str = "GPLUS_OTHER";
                break;
            case 54:
                str = "GPLUS_NICKNAME";
                break;
            case 55:
                str = "GPLUS_INVALID_CHAR";
                break;
            case 56:
                str = "GPLUS_INTERSTITIAL";
                break;
            case 57:
                str = "GPLUS_PROFILE_ERROR";
                break;
            case 58:
                str = "AUTH_SECURITY_ERROR";
                break;
            case 59:
                str = "AUTH_BINDING_ERROR";
                break;
            case 60:
                str = "ACCOUNT_NOT_PRESENT";
                break;
            case 61:
                str = "APP_SUSPENDED";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append(" with method:getTokenWithDetails");
        m0 m0Var = f20469c;
        m0Var.t(sb2.toString(), new Object[0]);
        String str3 = (String) m0Var.f840d;
        if (!z.a(9, i) && !z.a(19, i) && !z.a(23, i) && !z.a(24, i) && !z.a(14, i) && !z.a(26, i) && !z.a(40, i) && !z.a(32, i) && !z.a(33, i) && !z.a(34, i) && !z.a(35, i) && !z.a(36, i) && !z.a(37, i) && !z.a(39, i) && !z.a(31, i) && !z.a(38, i)) {
            if (z.a(5, i) || z.a(6, i) || z.a(7, i) || z.a(58, i) || z.a(60, i)) {
                throw new IOException(string);
            }
            throw new k(string);
        }
        p.c(context);
        ((c2) a2.f13170c.h()).getClass();
        if (!((Boolean) c2.f13187a.b()).booleanValue()) {
            throw new UserRecoverableAuthException(1, intent, string);
        }
        if (pendingIntent != null && intent != null) {
            throw new UserRecoverableAuthException(2, intent, string);
        }
        Object obj = f.f28772c;
        if (g.a(context) >= Integer.MAX_VALUE && pendingIntent == null) {
            Log.e(str3, m0Var.i("Recovery PendingIntent is missing on current Gms version: 2147483647 for method: getTokenWithDetails. It should always be present on or above Gms version 2147483647. This indicates a bug in Gms implementation.", new Object[0]));
        }
        if (intent == null) {
            Log.e(str3, m0Var.i(pe.a.f("no recovery Intent found with status=", string, " for method=getTokenWithDetails. This shouldn't happen"), new Object[0]));
        }
        throw new UserRecoverableAuthException(1, intent, string);
    }

    public static Object d(Context context, ComponentName componentName, d dVar) throws IOException {
        ma.a aVar = new ma.a();
        p0 p0VarA = p0.a(context);
        try {
            p0VarA.getClass();
            try {
                if (!p0VarA.b(new pa.m0(componentName), aVar, "GoogleAuthUtil", null).c()) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    return dVar.h(aVar.a());
                } catch (RemoteException | InterruptedException | TimeoutException e3) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e3);
                    throw new IOException("Error on service connection.", e3);
                }
            } finally {
                p0VarA.c(new pa.m0(componentName), aVar);
            }
        } catch (SecurityException e7) {
            Log.w("GoogleAuthUtil", "SecurityException while bind to auth service: " + e7.getMessage());
            throw new IOException("SecurityException while binding to Auth service.", e7);
        }
    }

    public static Object e(m mVar, String str) throws IOException, na.d {
        m0 m0Var = f20469c;
        try {
            return b4.b(mVar);
        } catch (InterruptedException e3) {
            String strF = pe.a.f("Interrupted while waiting for the task of ", str, " to finish.");
            m0Var.t(strF, new Object[0]);
            throw new IOException(strF, e3);
        } catch (CancellationException e7) {
            String strF2 = pe.a.f("Canceled while waiting for the task of ", str, " to finish.");
            m0Var.t(strF2, new Object[0]);
            throw new IOException(strF2, e7);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof na.d) {
                throw ((na.d) cause);
            }
            String strF3 = pe.a.f("Unable to get a result for ", str, " due to ExecutionException.");
            m0Var.t(strF3, new Object[0]);
            throw new IOException(strF3, e10);
        }
    }

    public static void f(Context context) throws k {
        try {
            j.a(context.getApplicationContext());
        } catch (GooglePlayServicesIncorrectManifestValueException | ma.h e3) {
            throw new k(e3.getMessage(), e3);
        } catch (i e7) {
            throw new b(1, new Intent(e7.f28776b), e7.getMessage());
        }
    }

    public static void g(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        if (TextUtils.isEmpty(bundle.getString("androidPackageName"))) {
            bundle.putString("androidPackageName", str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    public static void h(Account account) {
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        for (int i = 0; i < 3; i++) {
            if (f20467a[i].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    public static boolean i(Context context) {
        if (f.f28773d.c(context, 17895000) != 0) {
            return false;
        }
        ((f2) ((e2) d2.f13192c.f13193b.h())).getClass();
        com.google.android.gms.internal.auth.m0 m0VarK = ((z1) f2.f13208a.b()).k();
        String str = context.getApplicationInfo().packageName;
        Iterator it = m0VarK.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }
}
