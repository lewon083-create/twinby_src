package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rt0 extends gr implements Queue, Collection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedList f10060d;

    public rt0() {
        super(10);
        this.f10060d = new LinkedList();
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final /* synthetic */ Object C() {
        return this.f10060d;
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        nt0 nt0Var = (nt0) obj;
        int i = nt0Var.f8440f;
        LinkedList linkedList = this.f10060d;
        if (i != 3) {
            linkedList.add(nt0Var);
            return true;
        }
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            nt0 nt0Var2 = (nt0) listIterator.next();
            if (nt0Var2.f8440f == 3) {
                double d10 = nt0Var2.f8439e;
                double d11 = nt0Var.f8439e;
                if (d10 < d11 || (d10 == d11 && nt0Var2.a() > nt0Var.a())) {
                    listIterator.set(nt0Var);
                    nt0Var = nt0Var2;
                }
            }
        }
        linkedList.add(nt0Var);
        return true;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f10060d.addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f10060d.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f10060d.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f10060d.containsAll(collection);
    }

    @Override // java.util.Queue
    public final Object element() {
        return this.f10060d.element();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f10060d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f10060d.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return this.f10060d.offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.f10060d.peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return this.f10060d.poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return this.f10060d.remove();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f10060d.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f10060d.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f10060d.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f10060d.toArray();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f10060d.remove(obj);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f10060d.toArray(objArr);
    }
}
