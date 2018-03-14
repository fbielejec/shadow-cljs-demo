# shadow-cljs-demo

How-to integrate [shadow-cljs](https://shadow-cljs.github.io/docs/UsersGuide.html) with cider.

## Development:

- [shadow-cljs + cider](#cider)
- [running tests in a CI environment](#karma)

## <a name="cider">shadow-cljs + cider

1) Install npm dependencies:

```bash
yarn
```

2) Start the clj REPL:

```emacs
M+x cider-jack-in
```

3) Start the server, build watcher and get the cljs REPL:

```clojure
(watch-app!)
```

4) Point your browser to `localhost:4040`

## <a name="karma">testing with shadow-cljs + karma

Compile and run you tests once from the command line, and get back a status code:

```bash
yarn shadow-cljs compile ci
yarn karma start --single-run
```

You can also start a watcher and continuously evaluate the tests:

```bash
yarn shadow-cljs watch ci
```

in a separate terminal buffer:

```bash
yarn karma start
```
