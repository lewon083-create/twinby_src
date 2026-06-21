package i8;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import com.google.android.gms.internal.measurement.d4;
import e8.e;
import ii.s;
import ii.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements s, u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f21217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f21218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Activity f21219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f21221f;

    public b(Context context) {
        this.f21217b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ii.s
    public final boolean a(int i, int i10, Intent intent) {
        int i11;
        int iCanScheduleExactAlarms;
        Activity activity = this.f21219d;
        boolean z5 = false;
        z5 = false;
        if (activity != null) {
            if (this.f21221f == null) {
                this.f21220e = 0;
                return false;
            }
            if (i == 209) {
                Context context = this.f21217b;
                String packageName = context.getPackageName();
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName)) {
                    z5 = true;
                }
                i11 = 16;
                iCanScheduleExactAlarms = z5;
            } else if (i == 210) {
                if (Build.VERSION.SDK_INT >= 30) {
                    i11 = 22;
                    iCanScheduleExactAlarms = Environment.isExternalStorageManager();
                }
            } else if (i == 211) {
                i11 = 23;
                iCanScheduleExactAlarms = Settings.canDrawOverlays(activity);
            } else if (i == 212) {
                if (Build.VERSION.SDK_INT >= 26) {
                    i11 = 24;
                    iCanScheduleExactAlarms = activity.getPackageManager().canRequestPackageInstalls();
                }
            } else if (i == 213) {
                i11 = 27;
                iCanScheduleExactAlarms = ((NotificationManager) activity.getSystemService("notification")).isNotificationPolicyAccessGranted();
            } else if (i == 214) {
                i11 = 34;
                iCanScheduleExactAlarms = Build.VERSION.SDK_INT >= 31 ? ((AlarmManager) activity.getSystemService("alarm")).canScheduleExactAlarms() : true;
            }
            this.f21221f.put(Integer.valueOf(i11), Integer.valueOf(iCanScheduleExactAlarms));
            int i12 = this.f21220e - 1;
            this.f21220e = i12;
            e eVar = this.f21218c;
            if (eVar != null && i12 == 0) {
                eVar.f16294c.success(this.f21221f);
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ii.u
    public final boolean b(int i, String[] strArr, int[] iArr) {
        int i10;
        int i11 = 8;
        if (i != 24) {
            this.f21220e = 0;
            return false;
        }
        if (this.f21221f == null) {
            return false;
        }
        if (strArr.length == 0 && iArr.length == 0) {
            this.f21220e = 0;
            Log.w("permissions_handler", "onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues");
            return false;
        }
        List listAsList = Arrays.asList(strArr);
        int iIndexOf = listAsList.indexOf("android.permission.WRITE_CALENDAR");
        if (iIndexOf >= 0) {
            int iC = d4.C(this.f21219d, "android.permission.WRITE_CALENDAR", iArr[iIndexOf]);
            this.f21221f.put(36, Integer.valueOf(iC));
            int iIndexOf2 = listAsList.indexOf("android.permission.READ_CALENDAR");
            if (iIndexOf2 >= 0) {
                int iC2 = d4.C(this.f21219d, "android.permission.READ_CALENDAR", iArr[iIndexOf2]);
                Integer numValueOf = Integer.valueOf(iC);
                Integer numValueOf2 = Integer.valueOf(iC2);
                HashSet hashSet = new HashSet();
                hashSet.add(numValueOf);
                hashSet.add(numValueOf2);
                Integer numB = d4.B(hashSet);
                this.f21221f.put(37, numB);
                this.f21221f.put(0, numB);
            }
        }
        int i12 = 0;
        while (i12 < strArr.length) {
            String str = strArr[i12];
            if (!str.equals("android.permission.WRITE_CALENDAR") && !str.equals("android.permission.READ_CALENDAR")) {
                int i13 = -1;
                switch (str.hashCode()) {
                    case -2062386608:
                        if (str.equals("android.permission.READ_SMS")) {
                            i13 = 0;
                        }
                        break;
                    case -1928411001:
                        if (str.equals("android.permission.READ_CALENDAR")) {
                            i13 = 1;
                        }
                        break;
                    case -1925850455:
                        if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                            i13 = 2;
                        }
                        break;
                    case -1921431796:
                        if (str.equals("android.permission.READ_CALL_LOG")) {
                            i13 = 3;
                        }
                        break;
                    case -1888586689:
                        if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                            i13 = 4;
                        }
                        break;
                    case -1813079487:
                        if (str.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                            i13 = 5;
                        }
                        break;
                    case -1783097621:
                        if (str.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                            i13 = 6;
                        }
                        break;
                    case -1561629405:
                        if (str.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                            i13 = 7;
                        }
                        break;
                    case -1479758289:
                        if (str.equals("android.permission.RECEIVE_WAP_PUSH")) {
                            i13 = i11;
                        }
                        break;
                    case -1238066820:
                        if (str.equals("android.permission.BODY_SENSORS")) {
                            i13 = 9;
                        }
                        break;
                    case -1164582768:
                        if (str.equals("android.permission.READ_PHONE_NUMBERS")) {
                            i13 = 10;
                        }
                        break;
                    case -909527021:
                        if (str.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                            i13 = 11;
                        }
                        break;
                    case -895679497:
                        if (str.equals("android.permission.RECEIVE_MMS")) {
                            i13 = 12;
                        }
                        break;
                    case -895673731:
                        if (str.equals("android.permission.RECEIVE_SMS")) {
                            i13 = 13;
                        }
                        break;
                    case -798669607:
                        if (str.equals("android.permission.BLUETOOTH_CONNECT")) {
                            i13 = 14;
                        }
                        break;
                    case -406040016:
                        if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                            i13 = 15;
                        }
                        break;
                    case -63024214:
                        if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                            i13 = 16;
                        }
                        break;
                    case -5573545:
                        if (str.equals("android.permission.READ_PHONE_STATE")) {
                            i13 = 17;
                        }
                        break;
                    case 52602690:
                        if (str.equals("android.permission.SEND_SMS")) {
                            i13 = 18;
                        }
                        break;
                    case 112197485:
                        if (str.equals("android.permission.CALL_PHONE")) {
                            i13 = 19;
                        }
                        break;
                    case 175802396:
                        if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
                            i13 = 20;
                        }
                        break;
                    case 214526995:
                        if (str.equals("android.permission.WRITE_CONTACTS")) {
                            i13 = 21;
                        }
                        break;
                    case 361658321:
                        if (str.equals("android.permission.BODY_SENSORS_BACKGROUND")) {
                            i13 = 22;
                        }
                        break;
                    case 463403621:
                        if (str.equals("android.permission.CAMERA")) {
                            i13 = 23;
                        }
                        break;
                    case 603653886:
                        if (str.equals("android.permission.WRITE_CALENDAR")) {
                            i13 = 24;
                        }
                        break;
                    case 610633091:
                        if (str.equals("android.permission.WRITE_CALL_LOG")) {
                            i13 = 25;
                        }
                        break;
                    case 691260818:
                        if (str.equals("android.permission.READ_MEDIA_AUDIO")) {
                            i13 = 26;
                        }
                        break;
                    case 710297143:
                        if (str.equals("android.permission.READ_MEDIA_VIDEO")) {
                            i13 = 27;
                        }
                        break;
                    case 784519842:
                        if (str.equals("android.permission.USE_SIP")) {
                            i13 = 28;
                        }
                        break;
                    case 970694249:
                        if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                            i13 = 29;
                        }
                        break;
                    case 1166454870:
                        if (str.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                            i13 = 30;
                        }
                        break;
                    case 1271781903:
                        if (str.equals("android.permission.GET_ACCOUNTS")) {
                            i13 = 31;
                        }
                        break;
                    case 1365911975:
                        if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                            i13 = 32;
                        }
                        break;
                    case 1777263169:
                        if (str.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                            i13 = 33;
                        }
                        break;
                    case 1780337063:
                        if (str.equals("android.permission.ACTIVITY_RECOGNITION")) {
                            i13 = 34;
                        }
                        break;
                    case 1831139720:
                        if (str.equals("android.permission.RECORD_AUDIO")) {
                            i13 = 35;
                        }
                        break;
                    case 1977429404:
                        if (str.equals("android.permission.READ_CONTACTS")) {
                            i13 = 36;
                        }
                        break;
                    case 2024715147:
                        if (str.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                            i13 = 37;
                        }
                        break;
                    case 2062356686:
                        if (str.equals("android.permission.BLUETOOTH_SCAN")) {
                            i13 = 38;
                        }
                        break;
                    case 2114579147:
                        if (str.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                            i13 = 39;
                        }
                        break;
                    case 2133799037:
                        if (str.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                            i13 = 40;
                        }
                        break;
                }
                switch (i13) {
                    case 0:
                    case 8:
                    case 12:
                    case 13:
                    case 18:
                        i10 = 13;
                        break;
                    case 1:
                    case 24:
                        i10 = 0;
                        break;
                    case 2:
                        i10 = 17;
                        break;
                    case 3:
                    case 10:
                    case 17:
                    case 19:
                    case 25:
                    case 28:
                    case 40:
                        i10 = i11;
                        break;
                    case 4:
                    case 16:
                        i10 = 3;
                        break;
                    case 5:
                        i10 = 22;
                        break;
                    case 6:
                        i10 = 27;
                        break;
                    case 7:
                        i10 = 23;
                        break;
                    case 9:
                        i10 = 12;
                        break;
                    case 11:
                        i10 = 31;
                        break;
                    case 14:
                        i10 = 30;
                        break;
                    case 15:
                    case 32:
                        i10 = 15;
                        break;
                    case 20:
                        i10 = 9;
                        break;
                    case 21:
                    case 31:
                    case 36:
                        i10 = 2;
                        break;
                    case 22:
                        i10 = 35;
                        break;
                    case 23:
                        i10 = 1;
                        break;
                    case 26:
                        i10 = 33;
                        break;
                    case 27:
                        i10 = 32;
                        break;
                    case 29:
                        i10 = 34;
                        break;
                    case 30:
                        i10 = 29;
                        break;
                    case 33:
                        i10 = 24;
                        break;
                    case 34:
                        i10 = 19;
                        break;
                    case 35:
                        i10 = 7;
                        break;
                    case 37:
                        i10 = 4;
                        break;
                    case 38:
                        i10 = 28;
                        break;
                    case 39:
                        i10 = 18;
                        break;
                    default:
                        i10 = 20;
                        break;
                }
                if (i10 != 20) {
                    int i14 = iArr[i12];
                    if (i10 == i11) {
                        Integer num = (Integer) this.f21221f.get(8);
                        Integer numValueOf3 = Integer.valueOf(d4.C(this.f21219d, str, i14));
                        HashSet hashSet2 = new HashSet();
                        hashSet2.add(num);
                        hashSet2.add(numValueOf3);
                        this.f21221f.put(8, d4.B(hashSet2));
                    } else if (i10 == 7) {
                        if (!this.f21221f.containsKey(7)) {
                            this.f21221f.put(7, Integer.valueOf(d4.C(this.f21219d, str, i14)));
                        }
                        if (!this.f21221f.containsKey(14)) {
                            this.f21221f.put(14, Integer.valueOf(d4.C(this.f21219d, str, i14)));
                        }
                    } else if (i10 == 4) {
                        int iC3 = d4.C(this.f21219d, str, i14);
                        if (!this.f21221f.containsKey(4)) {
                            this.f21221f.put(4, Integer.valueOf(iC3));
                        }
                    } else if (i10 == 3) {
                        int iC4 = d4.C(this.f21219d, str, i14);
                        if (Build.VERSION.SDK_INT < 29 && !this.f21221f.containsKey(4)) {
                            this.f21221f.put(4, Integer.valueOf(iC4));
                        }
                        if (!this.f21221f.containsKey(5)) {
                            this.f21221f.put(5, Integer.valueOf(iC4));
                        }
                        this.f21221f.put(Integer.valueOf(i10), Integer.valueOf(iC4));
                    } else if (i10 == 9 || i10 == 32) {
                        this.f21221f.put(Integer.valueOf(i10), Integer.valueOf(c(i10)));
                    } else if (!this.f21221f.containsKey(Integer.valueOf(i10))) {
                        this.f21221f.put(Integer.valueOf(i10), Integer.valueOf(d4.C(this.f21219d, str, i14)));
                    }
                }
            }
            i12++;
            i11 = 8;
        }
        int length = this.f21220e - iArr.length;
        this.f21220e = length;
        e eVar = this.f21218c;
        if (eVar != null && length == 0) {
            eVar.f16294c.success(this.f21221f);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (new t1.u(r6).f33393a.areNotificationsEnabled() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(int r18) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.b.c(int):int");
    }

    public final boolean d() {
        ArrayList arrayListJ = d4.j(this.f21217b, 37);
        boolean z5 = arrayListJ != null && arrayListJ.contains("android.permission.WRITE_CALENDAR");
        boolean z10 = arrayListJ != null && arrayListJ.contains("android.permission.READ_CALENDAR");
        if (z5 && z10) {
            return true;
        }
        if (!z5) {
            Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
        }
        if (!z10) {
            Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
        }
        return false;
    }

    public final void e(int i, String str) {
        if (this.f21219d == null) {
            return;
        }
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.f21219d.getPackageName()));
        }
        this.f21219d.startActivityForResult(intent, i);
        this.f21220e++;
    }
}
