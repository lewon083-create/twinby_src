package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.twinby.R;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.sentry.protocol.Device;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ph0 extends ug implements et {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f9064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sd0 f9065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u9.l f9066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kh0 f9067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f9068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f9069h;

    public ph0(Context context, kh0 kh0Var, u9.l lVar, sd0 sd0Var) {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        this.f9063b = new HashMap();
        this.f9064c = context;
        this.f9065d = sd0Var;
        this.f9066e = lVar;
        this.f9067f = kh0Var;
    }

    public static void m4(Context context, sd0 sd0Var, kh0 kh0Var, String str, String str2, Map map) {
        String strA;
        p9.k kVar = p9.k.C;
        String str3 = true != kVar.f31302h.i(context) ? "offline" : Device.JsonKeys.ONLINE;
        if (sd0Var != null) {
            zd1 zd1VarA = sd0Var.a();
            zd1VarA.v("gqi", str);
            zd1VarA.v("action", str2);
            zd1VarA.v("device_connectivity", str3);
            kVar.f31304k.getClass();
            zd1VarA.v("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zd1VarA.v((String) entry.getKey(), (String) entry.getValue());
            }
            strA = ((sd0) zd1VarA.f12972d).f10244a.f11752f.a((ConcurrentHashMap) zd1VarA.f12971c);
        } else {
            strA = "";
        }
        String str4 = strA;
        p9.k.C.f31304k.getClass();
        cb cbVar = new cb(System.currentTimeMillis(), str, str4, 2);
        kh0Var.getClass();
        kh0Var.a(new n90(13, kh0Var, cbVar));
    }

    public static final PendingIntent n4(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return PendingIntent.getService(context, 0, k21.a(1140850688, intent), 1140850688);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return PendingIntent.getActivity(context, 0, k21.a(201326592, intent), 201326592);
    }

    public static String s4(int i10, String str) {
        Resources resourcesC = p9.k.C.f31302h.c();
        if (resourcesC == null) {
            return str;
        }
        try {
            return resourcesC.getString(i10);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    @Override // com.google.android.gms.internal.ads.et
    public final void M2(String[] strArr, int[] iArr, xa.a aVar) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals("android.permission.POST_NOTIFICATIONS")) {
                jh0 jh0Var = (jh0) xa.b.X1(aVar);
                Activity activity = jh0Var.f6846a;
                s9.d dVar = jh0Var.f6847b;
                HashMap map = new HashMap();
                if (iArr[i10] == 0) {
                    map.put("dialog_action", VKApiCodes.EXTRA_CONFIRM);
                    p4();
                    q4(activity, dVar);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (dVar != null) {
                        dVar.z();
                    }
                }
                r4(this.f9068g, "asnpdc", map);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.et
    public final void k() {
        this.f9067f.a(new ox0(27, this.f9066e));
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 1:
                Intent intent = (Intent) vg.b(parcel, Intent.CREATOR);
                vg.f(parcel);
                x0(intent);
                break;
            case 2:
                xa.a aVarL1 = xa.b.L1(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                vg.f(parcel);
                w3(aVarL1, new r9.a(string, string2, ""));
                break;
            case 3:
                k();
                break;
            case 4:
                xa.a aVarL12 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                s0(aVarL12);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                xa.a aVarL13 = xa.b.L1(parcel.readStrongBinder());
                vg.f(parcel);
                M2(strArrCreateStringArray, iArrCreateIntArray, aVarL13);
                break;
            case 6:
                xa.a aVarL14 = xa.b.L1(parcel.readStrongBinder());
                r9.a aVar = (r9.a) vg.b(parcel, r9.a.CREATOR);
                vg.f(parcel);
                w3(aVarL14, aVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public final void l4(String str, ja0 ja0Var) {
        en enVar;
        String string = "";
        String strF = ja0Var.f();
        String strA = ja0Var.a();
        if (TextUtils.isEmpty(strF)) {
            strF = strA != null ? strA : "";
        }
        en enVarB = ja0Var.b();
        if (enVarB != null) {
            try {
                string = enVarB.l().toString();
            } catch (RemoteException unused) {
            }
        }
        synchronized (ja0Var) {
            enVar = ja0Var.f6783s;
        }
        Drawable drawable = null;
        if (enVar != null) {
            try {
                xa.a aVarJ = enVar.j();
                if (aVarJ != null) {
                    drawable = (Drawable) xa.b.X1(aVarJ);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f9063b.put(str, new ih0(strF, string, drawable));
    }

    public final void o4(Activity activity, s9.d dVar) {
        t9.g0 g0Var = p9.k.C.f31297c;
        if (new t1.u(activity).f33393a.areNotificationsEnabled()) {
            p4();
            q4(activity, dVar);
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        w51 w51Var = w51.f11648h;
        if (i10 >= 33) {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            r4(this.f9068g, "asnpdi", w51Var);
        } else {
            AlertDialog.Builder builderL = t9.g0.l(activity);
            builderL.setTitle(s4(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(s4(R.string.notifications_permission_confirm, "Allow"), new oh0(this, activity, dVar, 0)).setNegativeButton(s4(R.string.notifications_permission_decline, "Don't allow"), new mh0(1, this, dVar)).setOnCancelListener(new nh0(this, dVar, 1));
            builderL.create().show();
            r4(this.f9068g, "rtsdi", w51Var);
        }
    }

    public final void p4() {
        boolean zZzg;
        boolean zZze;
        try {
            t9.g0 g0Var = p9.k.C.f31297c;
            Context context = this.f9064c;
            t9.w wVarC = t9.g0.c(context);
            xa.b bVar = new xa.b(context);
            String str = this.f9069h;
            String str2 = this.f9068g;
            ih0 ih0Var = (ih0) this.f9063b.get(str2);
            zZzg = wVarC.zzg(bVar, new r9.a(str, str2, ih0Var == null ? "" : ih0Var.f6492b));
            if (zZzg) {
                zZze = true;
            } else {
                try {
                    zZze = wVarC.zze(new xa.b(context), this.f9069h, this.f9068g);
                } catch (RemoteException e3) {
                    e = e3;
                    u9.i.f("Failed to schedule offline notification poster.", e);
                    zZze = zZzg;
                }
            }
        } catch (RemoteException e7) {
            e = e7;
            zZzg = false;
        }
        if (zZze) {
            return;
        }
        this.f9067f.b(this.f9068g);
        r4(this.f9068g, "offline_notification_worker_not_scheduled", w51.f11648h);
    }

    public final void q4(Activity activity, s9.d dVar) {
        XmlResourceParser layout;
        AlertDialog alertDialogCreate;
        p9.k kVar = p9.k.C;
        t9.g0 g0Var = kVar.f31297c;
        AlertDialog.Builder onCancelListener = t9.g0.l(activity).setOnCancelListener(new pz(2, dVar));
        Resources resourcesC = kVar.f31302h.c();
        if (resourcesC == null) {
            layout = null;
        } else {
            try {
                layout = resourcesC.getLayout(R.layout.offline_ads_dialog);
            } catch (Resources.NotFoundException unused) {
                layout = null;
            }
        }
        if (layout == null) {
            onCancelListener.setMessage(s4(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            alertDialogCreate = onCancelListener.create();
        } else {
            try {
                View viewInflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
                onCancelListener.setView(viewInflate);
                String str = this.f9068g;
                HashMap map = this.f9063b;
                ih0 ih0Var = (ih0) map.get(str);
                String str2 = ih0Var == null ? "" : ih0Var.f6491a;
                if (!TextUtils.isEmpty(str2)) {
                    TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                    textView.setVisibility(0);
                    textView.setText(str2);
                }
                ih0 ih0Var2 = (ih0) map.get(this.f9068g);
                Drawable drawable = ih0Var2 != null ? ih0Var2.f6493c : null;
                if (drawable != null) {
                    ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawable);
                }
                alertDialogCreate = onCancelListener.create();
                alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            } catch (Resources.NotFoundException unused2) {
                onCancelListener.setMessage(s4(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
                alertDialogCreate = onCancelListener.create();
            }
        }
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new lh0(this, alertDialogCreate, timer, dVar), 3000L);
    }

    public final void r4(String str, String str2, Map map) {
        m4(this.f9064c, this.f9065d, this.f9067f, str, str2, map);
    }

    @Override // com.google.android.gms.internal.ads.et
    public final void s0(xa.a aVar) {
        jh0 jh0Var = (jh0) xa.b.X1(aVar);
        Activity activity = jh0Var.f6846a;
        s9.d dVar = jh0Var.f6847b;
        this.f9068g = jh0Var.f6848c;
        this.f9069h = jh0Var.f6849d;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.B9)).booleanValue()) {
            o4(activity, dVar);
            return;
        }
        r4(this.f9068g, "dialog_impression", w51.f11648h);
        t9.g0 g0Var = p9.k.C.f31297c;
        AlertDialog.Builder builderL = t9.g0.l(activity);
        builderL.setTitle(s4(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(s4(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(s4(R.string.offline_opt_in_confirm, "OK"), new oh0(this, activity, dVar, 1)).setNegativeButton(s4(R.string.offline_opt_in_decline, "No thanks"), new mh0(0, this, dVar)).setOnCancelListener(new nh0(this, dVar, 0));
        builderL.create().show();
    }

    @Override // com.google.android.gms.internal.ads.et
    public final void w3(xa.a aVar, r9.a aVar2) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) xa.b.X1(aVar);
        String str2 = aVar2.f32272b;
        String str3 = aVar2.f32273c;
        String str4 = aVar2.f32274d;
        ih0 ih0Var = (ih0) this.f9063b.get(this.f9068g);
        String str5 = ih0Var == null ? "" : ih0Var.f6491a;
        p9.k.C.f31300f.l(context);
        PendingIntent pendingIntentN4 = n4(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentN42 = n4(context, "offline_notification_dismissed", str3, str2);
        t1.l lVar = new t1.l(context, "offline_notification_channel");
        if (TextUtils.isEmpty(str5)) {
            lVar.f33359e = t1.l.b(s4(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            lVar.f33359e = t1.l.b(String.format(s4(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), str5));
        }
        lVar.c(16, true);
        lVar.f33372s.deleteIntent = pendingIntentN42;
        lVar.f33361g = pendingIntentN4;
        lVar.f33372s.icon = context.getApplicationInfo().icon;
        wk wkVar = al.C9;
        q9.s sVar = q9.s.f31967e;
        lVar.f33363j = ((Integer) sVar.f31970c.a(wkVar)).intValue();
        if (!((Boolean) sVar.f31970c.a(al.E9)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
                bitmapDecodeStream = null;
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                lVar.d(bitmapDecodeStream);
                t1.j jVar = new t1.j();
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.f1323b = bitmapDecodeStream;
                jVar.f33351c = iconCompat;
                jVar.f33352d = null;
                jVar.f33353e = true;
                lVar.e(jVar);
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, lVar.a());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e3) {
            map.put("notification_not_shown_reason", e3.getMessage());
            str = "offline_notification_failed";
        }
        r4(str3, str, map);
    }

    @Override // com.google.android.gms.internal.ads.et
    public final void x0(Intent intent) {
        kh0 kh0Var = this.f9067f;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                bx bxVar = p9.k.C.f31302h;
                Context context = this.f9064c;
                boolean zI = bxVar.i(context);
                HashMap map = new HashMap();
                if (stringExtra.equals("offline_notification_clicked")) {
                    map.put("offline_notification_action", "offline_notification_clicked");
                    c = true == zI ? (char) 1 : (char) 2;
                    map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        map.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        map.put("olaa", "olaf");
                    }
                } else {
                    map.put("offline_notification_action", "offline_notification_dismissed");
                }
                r4(stringExtra2, "offline_notification_action", map);
                try {
                    SQLiteDatabase writableDatabase = kh0Var.getWritableDatabase();
                    if (c == 1) {
                        kh0Var.f7232c.execute(new d1(writableDatabase, stringExtra2, this.f9066e, 7));
                    } else {
                        writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
                    }
                } catch (SQLiteException e3) {
                    u9.i.e("Failed to get writable offline buffering database: ".concat(e3.toString()));
                }
            }
        }
    }
}
