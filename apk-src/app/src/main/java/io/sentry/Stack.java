package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.Objects;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
final class Stack {

    @NotNull
    private final Deque<StackItem> items;

    @NotNull
    private final AutoClosableReentrantLock itemsLock;

    @NotNull
    private final ILogger logger;

    public Stack(@NotNull ILogger iLogger, @NotNull StackItem stackItem) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.items = linkedBlockingDeque;
        this.itemsLock = new AutoClosableReentrantLock();
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "logger is required");
        linkedBlockingDeque.push((StackItem) Objects.requireNonNull(stackItem, "rootStackItem is required"));
    }

    @NotNull
    public StackItem peek() {
        return this.items.peek();
    }

    public void pop() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.itemsLock.acquire();
        try {
            if (this.items.size() != 1) {
                this.items.pop();
            } else {
                this.logger.log(SentryLevel.WARNING, "Attempt to pop the root scope.", new Object[0]);
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void push(@NotNull StackItem stackItem) {
        this.items.push(stackItem);
    }

    public int size() {
        return this.items.size();
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class StackItem {

        @NotNull
        private volatile ISentryClient client;
        private final SentryOptions options;

        @NotNull
        private volatile IScope scope;

        public StackItem(@NotNull SentryOptions sentryOptions, @NotNull ISentryClient iSentryClient, @NotNull IScope iScope) {
            this.client = (ISentryClient) Objects.requireNonNull(iSentryClient, "ISentryClient is required.");
            this.scope = (IScope) Objects.requireNonNull(iScope, "Scope is required.");
            this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "Options is required");
        }

        @NotNull
        public ISentryClient getClient() {
            return this.client;
        }

        @NotNull
        public SentryOptions getOptions() {
            return this.options;
        }

        @NotNull
        public IScope getScope() {
            return this.scope;
        }

        public void setClient(@NotNull ISentryClient iSentryClient) {
            this.client = iSentryClient;
        }

        public StackItem(@NotNull StackItem stackItem) {
            this.options = stackItem.options;
            this.client = stackItem.client;
            this.scope = stackItem.scope.m607clone();
        }
    }

    public Stack(@NotNull Stack stack) {
        this(stack.logger, new StackItem(stack.items.getLast()));
        Iterator<StackItem> itDescendingIterator = stack.items.descendingIterator();
        if (itDescendingIterator.hasNext()) {
            itDescendingIterator.next();
        }
        while (itDescendingIterator.hasNext()) {
            push(new StackItem(itDescendingIterator.next()));
        }
    }
}
