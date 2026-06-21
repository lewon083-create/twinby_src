package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Comparable, Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Calendar f14612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f14618h;

    public q(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = x.a(calendar);
        this.f14612b = calendarA;
        this.f14613c = calendarA.get(2);
        this.f14614d = calendarA.get(1);
        this.f14615e = calendarA.getMaximum(7);
        this.f14616f = calendarA.getActualMaximum(5);
        this.f14617g = calendarA.getTimeInMillis();
    }

    public static q a(int i, int i10) {
        Calendar calendarC = x.c(null);
        calendarC.set(1, i);
        calendarC.set(2, i10);
        return new q(calendarC);
    }

    public static q b(long j10) {
        Calendar calendarC = x.c(null);
        calendarC.setTimeInMillis(j10);
        return new q(calendarC);
    }

    public final String c() {
        if (this.f14618h == null) {
            long timeInMillis = this.f14612b.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = x.f14631a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f14618h = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f14618h;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f14612b.compareTo(((q) obj).f14612b);
    }

    public final int d(q qVar) {
        if (!(this.f14612b instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (qVar.f14613c - this.f14613c) + ((qVar.f14614d - this.f14614d) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f14613c == qVar.f14613c && this.f14614d == qVar.f14614d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14613c), Integer.valueOf(this.f14614d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14614d);
        parcel.writeInt(this.f14613c);
    }
}
