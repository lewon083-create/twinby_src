package t1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f33384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f33385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f33386d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashSet f33387e = new HashSet();

    public t(Context context) {
        this.f33384b = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f33385c = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(s sVar) {
        boolean z5;
        ArrayDeque arrayDeque = sVar.f33382d;
        ComponentName componentName = sVar.f33379a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (sVar.f33380b) {
            z5 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f33384b;
            boolean zBindService = context.bindService(component, this, 33);
            sVar.f33380b = zBindService;
            if (zBindService) {
                sVar.f33383e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z5 = sVar.f33380b;
        }
        if (!z5 || sVar.f33381c == null) {
            b(sVar);
            return;
        }
        while (true) {
            q qVar = (q) arrayDeque.peek();
            if (qVar == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + qVar);
                }
                qVar.a(sVar.f33381c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e3) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e3);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(sVar);
    }

    public final void b(s sVar) {
        ComponentName componentName = sVar.f33379a;
        ArrayDeque arrayDeque = sVar.f33382d;
        Handler handler = this.f33385c;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = sVar.f33383e;
        int i10 = i + 1;
        sVar.f33383e = i10;
        if (i10 <= 6) {
            int i11 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i11);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + sVar.f33383e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        c.c cVar = null;
        if (i == 0) {
            q qVar = (q) message.obj;
            String string = Settings.Secure.getString(this.f33384b.getContentResolver(), "enabled_notification_listeners");
            synchronized (u.f33388b) {
                if (string != null) {
                    try {
                        if (!string.equals(u.f33389c)) {
                            String[] strArrSplit = string.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            u.f33390d = hashSet2;
                            u.f33389c = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = u.f33390d;
            }
            if (!hashSet.equals(this.f33387e)) {
                this.f33387e = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.f33384b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.f33386d.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f33386d.put(componentName2, new s(componentName2));
                    }
                }
                Iterator it = this.f33386d.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        s sVar = (s) entry.getValue();
                        if (sVar.f33380b) {
                            this.f33384b.unbindService(this);
                            sVar.f33380b = false;
                        }
                        sVar.f33381c = null;
                        it.remove();
                    }
                }
            }
            for (s sVar2 : this.f33386d.values()) {
                sVar2.f33382d.add(qVar);
                a(sVar2);
            }
        } else if (i == 1) {
            r rVar = (r) message.obj;
            ComponentName componentName3 = rVar.f33377a;
            IBinder iBinder = rVar.f33378b;
            s sVar3 = (s) this.f33386d.get(componentName3);
            if (sVar3 != null) {
                int i10 = c.b.f2177b;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c.c.v1);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c.c)) {
                        c.a aVar = new c.a();
                        aVar.f2176b = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (c.c) iInterfaceQueryLocalInterface;
                    }
                }
                sVar3.f33381c = cVar;
                sVar3.f33383e = 0;
                a(sVar3);
                return true;
            }
        } else if (i == 2) {
            s sVar4 = (s) this.f33386d.get((ComponentName) message.obj);
            if (sVar4 != null) {
                if (sVar4.f33380b) {
                    this.f33384b.unbindService(this);
                    sVar4.f33380b = false;
                }
                sVar4.f33381c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            s sVar5 = (s) this.f33386d.get((ComponentName) message.obj);
            if (sVar5 != null) {
                a(sVar5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f33385c.obtainMessage(1, new r(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f33385c.obtainMessage(2, componentName).sendToTarget();
    }
}
