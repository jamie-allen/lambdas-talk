require "java"

stringHello= "Hello World"
stringDate = java.util.Date.new

puts "#{stringHello.to_s}"
puts "Date := #{stringDate.to_s}"

array = [1, 2, 3]
array.collect! do |n|
  n / 0
end

puts array.inspect

➜  lambda-rb  jruby HelloWorld.rb
Hello World
Date := Wed May 29 16:51:55 PDT 2013
ZeroDivisionError: divided by 0
         / at org/jruby/RubyFixnum.java:547
    (root) at HelloWorld.rb:11
  collect! at org/jruby/RubyArray.java:2385
    (root) at HelloWorld.rb:10