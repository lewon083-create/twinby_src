package com.google.gson.internal.bind;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import me.q;
import me.w;
import me.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f14969b = new x() { // from class: com.google.gson.internal.bind.SqlDateTypeAdapter$1
        @Override // me.x
        public final w a(me.k kVar, com.google.gson.reflect.a aVar) {
            if (aVar.getRawType() == Date.class) {
                return new i();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f14970a = new SimpleDateFormat("MMM d, yyyy");

    @Override // me.w
    public final Object a(re.b bVar) {
        synchronized (this) {
            if (bVar.s() == 9) {
                bVar.nextNull();
                return null;
            }
            try {
                return new Date(this.f14970a.parse(bVar.nextString()).getTime());
            } catch (ParseException e3) {
                throw new q(e3);
            }
        }
    }

    @Override // me.w
    public final void b(re.c cVar, Object obj) {
        Date date = (Date) obj;
        synchronized (this) {
            cVar.s(date == null ? null : this.f14970a.format((java.util.Date) date));
        }
    }
}
